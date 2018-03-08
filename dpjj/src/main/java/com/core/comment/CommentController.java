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

	@SystemControllerLog(description="������ҵ�б�ҳ��")
	@RequestMapping("/{domain}/enterpriselist.html")
	public String showCommentPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain){
		int pageTotle=27;//��¼��ҳ�������㷽��Ϊ���ݿ��ܼ�¼������ÿҳ�ļ�¼������ҵ�б�ÿҳ20��������ȡ��
		model.addAttribute("domain", domain);
		model.addAttribute("page_total", pageTotle);
		return "commentFirstLevelPage";
	}
	
	@SystemControllerLog(description="������ҵ��Ʒ�б�ҳ��")
	@RequestMapping("/{domain}/showsmallpaper")
	public String showProductPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("id")String id){
		int pageTotle=24;//��¼��ҳ�������㷽��Ϊ���ݿ��ܼ�¼������ÿҳ�ļ�¼������Ʒ�б�ÿҳ30��������ȡ��
		model.addAttribute("domain", domain);
		model.addAttribute("id", id);
		model.addAttribute("page_total", pageTotle);
		return "commentProductPage";
	}
	
	@SystemControllerLog(description="�����Ʒ����ҳ��")
	@RequestMapping("/{domain}/showscore")
	public String showScorePage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("id")String id){
		model.addAttribute("domain", domain);
		model.addAttribute("product_id", id);
		return "commentScorePage";
	}
	
	@SystemControllerLog(description="�����Ʒ���ҳ��")
	@RequestMapping("/{domain}/showpointpage")
	public String showPointPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("productid")String productId){
		model.addAttribute("domain", domain);
		model.addAttribute("product_id", productId);
		return "commentPointPage";
	}	
	@SystemControllerLog(description="�����Ʒ����ҳ��")
	@RequestMapping("/{domain}/showproductdetail")
	public String showDetailPage(HttpServletRequest request , HttpServletResponse response,Model model,
			@PathVariable("domain")String domain,
			@RequestParam("productid")String productId,
			@RequestParam("terminal")String terminal){
		model.addAttribute("domain", domain);
		model.addAttribute("product_id", productId);
		model.addAttribute("terminal", terminal);
		model.addAttribute("title", "�������ٱ���");
		model.addAttribute("content", "�ٶȿ�����Ŀ��˴��ٶȿ��˵�򿨴����˵Ŀ����˵Ĵ���"
				+ "��Ŀ���Ƶ�����尡���������������Ƶ������ϴ���Ƶ����Ƶ�򿪰�"
				+ "�ǵ��¿�����Ƶ���ǿ϶����Ͽ��������ݵĿ�Ƭ٩��ɽ����Ƶ���������϶����������˵����յ���");//ʾ��
		return "commentDetailPage";
	}	
}
