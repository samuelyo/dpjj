package main.java.com.core.logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import main.java.com.core.webUtil.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/logout")
public class LogoutController {
	@RequestMapping("/")
	public String logout(HttpServletRequest request){
		
		/*String headerValue =  request.getHeader("referer");
		String refererURL = headerValue.substring(0, headerValue.indexOf("?")==-1?headerValue.length():headerValue.indexOf("?"));*/
		String path=request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		HttpSession session = request.getSession();
		session.removeAttribute(WebConstants.CURRENT_USER);
		session.removeAttribute(WebConstants.LOGIN_TOKEN);
		session.removeAttribute(WebConstants.LOGIN_TOKEN);
		session.removeAttribute(WebConstants.ROLE);
		return "redirect:"+basePath;
	}
}
