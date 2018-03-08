package main.java.com.core.register;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import main.java.com.core.annotationsDef.SystemControllerLog;
import main.java.com.core.log.model.User;
import main.java.com.core.login.service.IUserService;
import main.java.com.core.login.service.impl.UserServiceImpl;
import main.java.com.core.model.EnterpriseUser;
import main.java.com.core.model.GeneralUser;
import main.java.com.core.register.service.IRegistService;
import main.java.com.core.register.service.impl.RegistServiceImpl;
import main.java.com.core.webUtil.TokenGenerator;
import main.java.com.core.webUtil.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.code.kaptcha.Constants;

@Controller
@RequestMapping("/regist")
public class RegistController {
	
	@Resource(type=UserServiceImpl.class)
	private IUserService<User, String> userService;
	
	@Resource(type=RegistServiceImpl.class)
	private IRegistService registService;
	
	@SystemControllerLog(description="请求注册页面")
	@RequestMapping("/generalregistpage.html")
	public String getGeneralRegistPage(HttpServletRequest request ){
		String headerValue =  request.getHeader("referer");
		String refererURL = headerValue.substring(0, headerValue.indexOf("?")==-1?headerValue.length():headerValue.indexOf("?"));
		HttpSession session = request.getSession();
		//session.setAttribute("role",role);
		session.setAttribute(WebConstants.REFERER_URL,refererURL);
		return "generalRegistPage";
	}
	
	@SystemControllerLog(description="请求注册页面")
	@RequestMapping("/enterpriseregistpage.html")
	public String getEnterpriseRegistPage(HttpServletRequest request ){
		String headerValue =  request.getHeader("referer");
		String refererURL = headerValue.substring(0, headerValue.indexOf("?")==-1?headerValue.length():headerValue.indexOf("?"));
		HttpSession session = request.getSession();
		//session.setAttribute("role",role);
		session.setAttribute(WebConstants.REFERER_URL,refererURL);
		return "enterpriseRegistPage";
	}
	
	@SystemControllerLog(description="检查当前用户名是否已经存在,请求附带查询字符串format=json")
	@RequestMapping("/usernameisexist.html")
	public Map<String, String> checkDuplicate(HttpServletRequest request ,
			@RequestParam(value="user_name")String userName){
		Map<String,String> map = new HashMap<String, String>();
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");
		User user = userService.checkLoginByName(userName, role);
		if(null==user){
			map.put("result", "true");
			return map;
		}
		map.put("result", "false");
		return map;
	}
	
	@RequestMapping(value="/checkKaptcha.html",name="检查验证码,请求附带查询字符串format=json")
	public Map<String,String> checkKaptcha(HttpServletRequest request,@RequestParam(value="captcha")String captcha){
		
		Map<String,String> message = new HashMap<String,String>();
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");
		String kaptcha=(String)session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
		if(!kaptcha.equals(captcha)){
			message.put("result", "success");
		}
		message.put("result", "fail");
		return message;
	}
	
	
	@SystemControllerLog(description="检验用户提交的注册表单，完成注册")
	@RequestMapping("/checkEnterpriseUserRegistPage.html")
	public String checkEnterpriseUserRegist(HttpServletRequest request ,HttpServletResponse response ,
			@Valid EnterpriseUser user, BindingResult result, ModelMap model){
		if(result.hasErrors()) {
	        return "registPage";
		}
		HttpSession session = request.getSession();
		
		EnterpriseUser wholeUser = registService.insertEnterpriseUser(user);
		String userId = wholeUser.getUserId();
		String userip = request.getRemoteAddr();
		String token = TokenGenerator.getInstance().makeToken(userip, userId);
		session.setAttribute(WebConstants.CURRENT_USER, userId);
		session.setAttribute(WebConstants.LOGIN_TOKEN, token);
		Cookie cookie = new Cookie(WebConstants.LOGIN_TOKEN, token);
        response.addCookie(cookie);
		
		String referer = (String) session.getAttribute(WebConstants.REFERER_URL);
		return "redirect:"+referer;
	}
	
	
	
	
	@SystemControllerLog(description="检验用户提交的注册表单，完成注册")
	@RequestMapping("/checkgeneralUserRegistPage.html")
	public String checkGeneralUserRegist(HttpServletRequest request ,HttpServletResponse response ,
			@Valid GeneralUser user, BindingResult result, ModelMap model){
		if(result.hasErrors()) {
	        return "registPage";
		}
		HttpSession session = request.getSession();
		GeneralUser wholeUser = registService.insertGeneralUser(user);
		String userId = wholeUser.getUserId();
		String userip = request.getRemoteAddr();
		String token = TokenGenerator.getInstance().makeToken(userip, userId);
		session.setAttribute(WebConstants.CURRENT_USER, userId);
		session.setAttribute(WebConstants.LOGIN_TOKEN, token);
		Cookie cookie = new Cookie(WebConstants.LOGIN_TOKEN, token);
        response.addCookie(cookie);
		
		String referer = (String) session.getAttribute(WebConstants.REFERER_URL);
		return "redirect:"+referer;
	}
	
	
	
	
	@SystemControllerLog(description="当前用户为使用微信登陆系统时，用户就在数据库中有了一条记录，此时页面显示提示用户完成用户注册信息填充")
	@RequestMapping("/fillregistinfo.html")
	public String fillRegistInfo(){
		
		return "registPage";
	}
	
}
