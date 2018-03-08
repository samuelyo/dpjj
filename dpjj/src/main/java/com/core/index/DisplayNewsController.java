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
	@SystemControllerLog(description="请求新闻题目")
	@ResponseBody
	public String getnewstitle(HttpServletRequest request,HttpServletResponse response,Model model,
			@PathVariable(value="type")String type ,
			@RequestParam(value="index1")String index1,
			@RequestParam(value="index2")String index2){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/getnews/{type}/image")
	@SystemControllerLog(description="请求新闻图片")
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
        BufferedImage bi = null;///////////////////////////////////////////将数据库中图片西到前台//////////////////////////////////////
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
	@SystemControllerLog(description="请求新闻页面")
	public String showNews(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		
		
		return "";
	}
	
	@RequestMapping("/getlaws")
	@SystemControllerLog(description="请求政策法规")
	public String getLaws(HttpServletRequest request,HttpServletResponse response,Model model){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/showlaw")
	@SystemControllerLog(description="查看政策法规")
	public String showLaw(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/getrecommendations")
	@SystemControllerLog(description="请求产品推荐")
	public String getRecommendations(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/showrecommendations")
	@SystemControllerLog(description="查看产品推荐")
	public String showRecommendation(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/getcomments")
	@SystemControllerLog(description="最新点评")
	public String getComments(HttpServletRequest request,HttpServletResponse response,Model model,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
	
	@RequestMapping("/showcomment")
	@SystemControllerLog(description="最新点评")
	public String showComment(HttpServletRequest request,HttpServletResponse response,Model model,
			@PathVariable(value="type")String type ,
			@RequestParam(value="id")String id){
		String title =null;
		
		return title;
	}
}
