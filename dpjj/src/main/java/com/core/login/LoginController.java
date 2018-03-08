package main.java.com.core.login;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.com.core.annotationsDef.SystemControllerLog;
import main.java.com.core.log.model.User;
import main.java.com.core.login.service.IUserService;
import main.java.com.core.login.service.impl.UserServiceImpl;
import main.java.com.core.webUtil.TokenGenerator;
import main.java.com.core.webUtil.WebConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.impl.DefaultKaptcha;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Resource(type=UserServiceImpl.class)
	private IUserService<User, String> userService;
	@Autowired
	private DefaultKaptcha captchaProducer;
	
	@SystemControllerLog
	@RequestMapping("/{role}/login.html")
	public String showLoginPage(HttpServletRequest request,HttpServletResponse response,Model model,
			@PathVariable(value="role")String role){
		//记录登陆前页面，以便登陆后跳转
		String headerValue =  request.getHeader("referer");
		String refererURL = headerValue.substring(0, headerValue.indexOf("?")==-1?headerValue.length():headerValue.indexOf("?"));
		HttpSession session = request.getSession();
		session.setAttribute(WebConstants.ROLE,role);      //登陆页面要承载的隐藏信息
		model.addAttribute(WebConstants.REFERER_URL,refererURL);
	/*	String captcha = randomStringProductor();
		session.setAttribute(Constants.KAPTCHA_SESSION_KEY,captcha);
		BufferedImage captchaImage = captchaProducer.createImage(captcha);*/
		return "login";
	}
	
	private String randomStringProductor() {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<5;i++){
			buf.append(96+Math.round(Math.random()*26));
		}
		String captcha = buf.toString();
		return captcha;
	}
	
	@SystemControllerLog
	@RequestMapping("/xlogin")
	public String xLogin(HttpServletRequest request,HttpServletResponse response,
			Model model,
			@RequestParam(value="referer")String referer,
			@RequestParam(value="role")String role){
		//记录登陆前页面，以便登陆后跳转
		String headerValue =  request.getHeader("referer");
		String refererURL = headerValue.substring(0, headerValue.indexOf("?")==-1?headerValue.length():headerValue.indexOf("?"));
		HttpSession session = request.getSession();
		session.setAttribute(WebConstants.ROLE,role);
		model.addAttribute(WebConstants.REFERER_URL,refererURL);
		return "login/xlogin";
	}

	@SystemControllerLog
	@RequestMapping(value ="/LoginCheck.html",method=RequestMethod.POST)
	@ResponseBody
	public String adminLoginCheckController(HttpServletRequest request,
			HttpServletResponse response,Model model,
			@RequestParam(value="user_name")String userName,
			@RequestParam(value="user_passwd")String userPasswd,
			@RequestParam(value="captcha")String captcha,
			@RequestParam(value="referer")String referer) throws IOException{
		
		String userip = request.getRemoteAddr();
		User user =null;
		String message = null;
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute(WebConstants.ROLE);
		String kaptcha=(String)session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
		if(!kaptcha.equals(captcha)){
			message = writeParamError(request,response,WebConstants.RESULT_ERROR_CODE[3]);
			return message;
		}
		if("".equals(userName)||null==userName){
			message = writeParamError(request,response,WebConstants.RESULT_ERROR_CODE[0]);
			return message;
		}
		user = userService.checkLoginByName(userName, role);
		if(null==user){
			message = writeParamError(request,response,WebConstants.RESULT_ERROR_CODE[2]);
			return message;
		}
		if(!user.getUserPasswd().equals(userPasswd)){
			message = writeParamError(request,response,WebConstants.RESULT_ERROR_CODE[1]);
			return message;
		}
		String userId = user.getUserId();
		String token = TokenGenerator.getInstance().makeToken(userip, userId);
		session.setAttribute(WebConstants.CURRENT_USER, userId);
		session.setAttribute(WebConstants.LOGIN_TOKEN, token);
		session.setAttribute(WebConstants.CURRENT_USERINFO, user);
		Cookie cookie = new Cookie(WebConstants.LOGIN_TOKEN, token);
        response.addCookie(cookie);

        return "redirect:"+referer;
	}
	
	
	
	private String writeParamError(HttpServletRequest request,HttpServletResponse response,String errorSignal) throws IOException{
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("result", errorSignal);
		ObjectMapper mapper = new ObjectMapper();
		String json=null;
		try {
			json=mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*ServletOutputStream out = response.getOutputStream();
		PrintWriter writer = new PrintWriter(out);
		writer.write(json);*/
		return json;
	}
}
