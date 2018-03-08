package main.java.com.core.community;

import main.java.com.core.annotationsDef.SystemControllerLog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/community")
public class CommunityController {
	
	@RequestMapping("/communitytipslist")
	@SystemControllerLog(description="��������̳�б�ҳ")
	public String showTipsListPage(){
		
		
		return "communityTipsListPage";
	}
}
