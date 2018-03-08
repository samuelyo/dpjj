package main.java.com.core.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.com.core.log.model.User;
import main.java.com.core.login.service.IUserService;
import main.java.com.core.login.service.impl.UserServiceImpl;
import main.java.com.core.webUtil.WebConstants;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AutoLoginInterceptor implements HandlerInterceptor {
	 
	 @Resource(type = UserServiceImpl.class)
	 IUserService<User, String> userService ;
	 @Override  
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception { 

		 HttpSession session = request.getSession();
		 Cookie cookies[] = request.getCookies(); 
		 
	     if (cookies != null) {
	    	 for (Cookie cookie : cookies) {
	    		 // 判断是否已经存在token记录,tokentoken是否正确
	    		 if (WebConstants.LOGIN_TOKEN.equals(cookie.getName())
	    				 && (null==session.getAttribute(WebConstants.LOGIN_TOKEN)
	    				 ||!((String)session.getAttribute(WebConstants.LOGIN_TOKEN)).equals(cookie.getComment()))) {
	    			 
	    			 return false;
	    			 
	    		 }/*else if(WebConstants.LOGIN_TOKEN.equals(cookie.getName())
	    				 &&((String)session.getAttribute(WebConstants.LOGIN_TOKEN)).equals(cookie.getComment())){
	    			 
	    			 String userId = (String)session.getAttribute(WebConstants.CURRENT_USER);
	    			 String role = (String) session.getAttribute("role");
	    			 User user = userService.checkLoginById(userId, role);
	    			 session.setAttribute(WebConstants.CURRENT_USERINFO, user);
	    		 }*/
	    	 }
	     }
		 return true;  
	 }  
	 @Override  
	 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {  
	        
	 }  
	 @Override  
	 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		 /*HttpSession session = request.getSession();
		 if(null!=session.getAttribute(WebConstants.CURRENT_USERINFO)){
			 session.removeAttribute(WebConstants.CURRENT_USERINFO);
		 }*/
	 }  
}
