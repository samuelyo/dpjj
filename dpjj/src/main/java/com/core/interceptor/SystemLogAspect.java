package main.java.com.core.interceptor;

import java.lang.reflect.Method;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import main.java.com.core.annotationsDef.SystemControllerLog;
import main.java.com.core.annotationsDef.SystemServiceLog;
import main.java.com.core.commonUtils.DateUtil;
import main.java.com.core.commonUtils.JSONUtil;
import main.java.com.core.log.model.Log;
import main.java.com.core.log.model.User;
import main.java.com.core.log.service.LogService;









import main.java.com.core.model.GeneralUser;
import main.java.com.core.webUtil.SpringContextHolder;
import main.java.com.core.webUtil.WebConstants;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;    
import org.springframework.web.context.request.ServletRequestAttributes; 

/**  
 * 切点类  
 * @author jamesY  
 * @since 2016-10-27 Am 10:27  
 * @version 1.0  
 */    
@Aspect    
@Component    
public  class SystemLogAspect {    
    //注入Service用于把日志保存数据库    
    @Resource    
     private LogService logService;    
    //本地异常日志记录对象    
     private  static  final Logger logger = Logger.getLogger(Log.class) ;
    
    //Service层切点    
    @Pointcut("@annotation(main.java.com.core.annotationsDef.SystemServiceLog)")    
     public  void serviceAspect() {    
    }    
    
    //Controller层切点    
    @Pointcut("@annotation(main.java.com.core.annotationsDef.SystemControllerLog)")    
     public  void controllerAspect() {    
    }    
    
    //Dao层切点    
    @Pointcut("@annotation(main.java.com.core.annotationsDef.SystemDaoLog)")    
     public  void daoAspect() {    
    }    
    
    /**  
     * 前置通知 用于拦截Controller层记录用户的操作  
     *  
     * @param joinPoint 切点  
     */    
    @Before("controllerAspect()")    
     public  void doBefore(JoinPoint joinPoint) {    
    
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();    
        HttpSession session = request.getSession();    
        //读取session中的用户    
        GeneralUser user = (GeneralUser) session.getAttribute(WebConstants.CURRENT_USER);    
        //请求的IP    
        String ip = request.getRemoteAddr();    
         try {    
            //*========控制台输出=========*//    
            System.out.println("=====前置通知开始=====");    
            System.out.println("请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            System.out.println("方法描述:" + getControllerMethodDescription(joinPoint));    
            System.out.println("请求人:" + user.getUserName());    
            System.out.println("请求IP:" + ip);    
            //*========数据库日志=========*//    
            Log log = SpringContextHolder.getBean("log1");    
            log.setDescription(getControllerMethodDescription(joinPoint));    
            log.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            log.setType("0");    
            log.setRequestIp(ip);    
            log.setExceptionCode( null);    
            log.setExceptionDetail( null);    
            log.setParams( null);    
            log.setCreateBy(user);    
            log.setCreateDate(DateUtil.getCurrentDate());    
            //保存数据库    
            logService.add(log);    
            System.out.println("=====前置通知结束=====");    
        }  catch (Exception e) {    
            //记录本地异常日志    
            logger.error("==前置通知异常==");    
            logger.error("异常信息: "+ e.getMessage());    
        }    
    }    
    
    /**  
     * 异常通知 用于拦截service层记录异常日志  
     *  
     * @param joinPoint  
     * @param e  
     */    
    @AfterThrowing(pointcut = "serviceAspect()", throwing = "e")    
     public  void doAfterThrowing(JoinPoint joinPoint, Throwable e) {    
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();    
        HttpSession session = request.getSession();    
        //读取session中的用户    
        User user = (User) session.getAttribute("user");    
        //获取请求ip    
        String ip = request.getRemoteAddr();    
        //获取用户请求方法的参数并序列化为JSON格式字符串    
        String params = "";    
         if (joinPoint.getArgs() !=  null && joinPoint.getArgs().length > 0) {    
             for ( int i = 0; i < joinPoint.getArgs().length; i++) { 
            	 String paramTpyeName = joinPoint.getArgs()[i].toString().substring(0, joinPoint.getArgs()[i].toString().indexOf("@"));
                params += paramTpyeName + ",";    
            }    
        }    
         try {    
              /*========控制台输出=========*/    
            System.out.println("=====异常通知开始=====");    
            System.out.println("异常代码:" + e.getClass().getName());    
            System.out.println("异常信息:" + e.getMessage());    
            System.out.println("异常方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            System.out.println("方法描述:" + getServiceMthodDescription(joinPoint));    
            System.out.println("请求人:" + user.getUserName());    
            System.out.println("请求IP:" + ip);    
            System.out.println("请求参数:" + params);    
               /*==========数据库日志=========*/    
            Log log = SpringContextHolder.getBean("log1");    
            log.setDescription(getServiceMthodDescription(joinPoint));    
            log.setExceptionCode(e.getClass().getName());    
            log.setType("1");    
            log.setExceptionDetail(e.getMessage());    
            log.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));    
            log.setParams(params);    
            log.setCreateBy(user);    
            log.setCreateDate(DateUtil.getCurrentDate());    
            log.setRequestIp(ip);    
            //保存数据库    
            logService.add(log,request);    
            System.out.println("=====异常通知结束=====");    
        }  catch (Exception ex) {    
            //记录本地异常日志    
            logger.error("==异常通知异常==");    
            logger.error("异常信息: "+ ex.getMessage());    
        }    
         /*==========记录本地异常日志==========*/    
        logger.error(" 异常方法: "+ joinPoint.getTarget().getClass().getName() + joinPoint.getSignature().getName()
        		+" , 异常代码: "+  e.getClass().getName()+" , 异常信息: "+ e.getMessage() +" , 参数: "+params);    
    
    }    
    
    
    /**  
     * 获取注解中对方法的描述信息 用于service层注解  
     *  
     * @param joinPoint 切点  
     * @return 方法描述  
     * @throws Exception  
     */    
     public  static String getServiceMthodDescription(JoinPoint joinPoint)    
             throws Exception {    
        String targetName = joinPoint.getTarget().getClass().getName();    
        String methodName = joinPoint.getSignature().getName();    
        Object[] arguments = joinPoint.getArgs();    
        Class targetClass = Class.forName(targetName);    
        Method[] methods = targetClass.getMethods();    
        String description = "";    
         for (Method method : methods) {    
             if (method.getName().equals(methodName)) {    
                Class[] clazzs = method.getParameterTypes();    
                 if (clazzs.length == arguments.length) {    
                    description = method.getAnnotation(SystemServiceLog. class).description();    
                     break;    
                }    
            }    
        }    
         return description;    
    }    
    
    /**  
     * 获取注解中对方法的描述信息 用于Controller层注解  
     *  
     * @param joinPoint 切点  
     * @return 方法描述  
     * @throws Exception  
     */    
     public  static String getControllerMethodDescription(JoinPoint joinPoint)  throws Exception {    
        String targetName = joinPoint.getTarget().getClass().getName();    
        String methodName = joinPoint.getSignature().getName();    
        Object[] arguments = joinPoint.getArgs();    
        Class targetClass = Class.forName(targetName);    
        Method[] methods = targetClass.getMethods();    
        String description = "";    
         for (Method method : methods) {    
             if (method.getName().equals(methodName)) {    
                Class[] clazzs = method.getParameterTypes();    
                 if (clazzs.length == arguments.length) {    
                    description = method.getAnnotation(SystemControllerLog. class).description();    
                     break;    
                }    
            }    
        }    
         return description;    
    }    
}    
