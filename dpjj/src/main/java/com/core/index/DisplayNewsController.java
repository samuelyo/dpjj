package main.java.com.core.index;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.com.core.annotationsDef.SystemControllerLog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.code.kaptcha.Constants;


@Controller

public class DisplayNewsController {
	
	
	@RequestMapping("/getnews/{type}/title")
	@SystemControllerLog(description="����������Ŀ")
	@ResponseBody
	public String getnewstitle(HttpServletRequest request,HttpServletResponse response,Model model,
			@PathVariable(value="type")String type ,
			@RequestParam(value="index1")String index1,
			@RequestParam(value="index2")String index2){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/getnews/{type}/image")
	@SystemControllerLog(description="��������ͼƬ")
	@ResponseBody
	public String getnewsimage(HttpServletRequest request, HttpServletResponse response,
			@PathVariable(value="type")String type ,
			@RequestParam(value="id")String id)throws Exception{
		
		HttpSession session = request.getSession();  
		response.setDateHeader("Expires", 0); 
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");  
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");  
        response.setHeader("Pragma", "no-cache");  
        response.setContentType("image/jpeg");  
        BufferedImage bi = null;///////////////////////////////////////////�����ݿ���ͼƬ����ǰ̨//////////////////////////////////////
        ServletOutputStream out = response.getOutputStream();  
          
        // write the data out  
        ImageIO.write(bi, "jpg", out);  
        try {  
            out.flush();  
        } finally {  
            out.close();  
        }  
        return null;  
	}
	
	@RequestMapping("/shownews")
	@SystemControllerLog(description="��������ҳ��")
	public String showNews(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		
		
		return "";
	}
	
	@RequestMapping("/getlaws")
	@SystemControllerLog(description="�������߷���")
	public String getLaws(HttpServletRequest request,HttpServletResponse response,Model model){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/showlaw")
	@SystemControllerLog(description="�鿴���߷���")
	public String showLaw(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/getrecommendations")
	@SystemControllerLog(description="�����Ʒ�Ƽ�")
	public String getRecommendations(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/showrecommendations")
	@SystemControllerLog(description="�鿴��Ʒ�Ƽ�")
	public String showRecommendation(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/getcomments")
	@SystemControllerLog(description="���µ���")
	public String getComments(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/showcomment")
	@SystemControllerLog(description="���µ���")
	public String showComment(HttpServletRequest request,HttpServletResponse response,Model model,
			@PathVariable(value="type")String type ,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
}
