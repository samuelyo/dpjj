package main.java.com.core.comment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.core.annotationsDef.SystemControllerLog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@SystemControllerLog(description="请求企业列表页面")
	@RequestMapping("/{domain}/enterpriselist.html")
	public String showCommentPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain){
		int pageTotle=27;//记录总页数，计算方法为数据库总记录数除以每页的记录数（企业列表每页20条）商上取整
		model.addAttribute("domain", domain);
		model.addAttribute("page_total", pageTotle);
		return "commentFirstLevelPage";
	}
	
	@SystemControllerLog(description="请求企业产品列表页面")
	@RequestMapping("/{domain}/showsmallpaper")
	public String showProductPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("id")String id){
		int pageTotle=24;//记录总页数，计算方法为数据库总记录数除以每页的记录数（产品列表每页30条）商上取整
		model.addAttribute("domain", domain);
		model.addAttribute("id", id);
		model.addAttribute("page_total", pageTotle);
		return "commentProductPage";
	}
	
	@SystemControllerLog(description="请求产品评分页面")
	@RequestMapping("/{domain}/showscore")
	public String showScorePage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("id")String id){
		model.addAttribute("domain", domain);
		model.addAttribute("product_id", id);
		return "commentScorePage";
	}
	
	@SystemControllerLog(description="请求产品打分页面")
	@RequestMapping("/{domain}/showpointpage")
	public String showPointPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("productid")String productId){
		model.addAttribute("domain", domain);
		model.addAttribute("product_id", productId);
		return "commentPointPage";
	}	
	@SystemControllerLog(description="请求产品详情页面")
	@RequestMapping("/{domain}/showproductdetail")
	public String showDetailPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("productid")String productId,
			@RequestParam("terminal")String terminal){
		model.addAttribute("domain", domain);
		model.addAttribute("product_id", productId);
		model.addAttribute("terminal", terminal);
		model.addAttribute("title", "生命人寿保险");
		model.addAttribute("content", "速度快拉大的卡了打开速度卡了点打卡打卡上了的卡死了的大厦"
				+ "里的卡视频看大叔啊快点爬上撒旦卡视频快点爬上打视频打开视频打开啊"
				+ "是的怕看到视频啊是肯定怕上看到打开撒泡的卡片侃大山啊视频看打牌撒肯定菩萨爱上了的啦收到了");//示例
		return "commentDetailPage";
	}	
}
