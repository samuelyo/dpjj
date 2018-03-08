package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.core.databaseUtil.SQLRespository;
import main.java.com.core.model.Admin;
import main.java.com.core.model.EnterpriseUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/test1.html")
	@ResponseBody
	public String test(){
		
		String sql = SQLRespository.getDeleteSqlMap(Admin.class, "id=1");
		System.out.println("=========="+sql+"==========");
		return sql;
		
	}
	@RequestMapping("/test2.html")
	public ModelMap test2(@RequestParam(value = "format")String format,ModelMap mmap){
		
		Map<String,String> map = new HashMap<String, String>();
		map.put(Admin.class.getName(), SQLRespository.getInsertSqlMap(Admin.class));
		map.put(EnterpriseUser.class.getName(), SQLRespository.getInsertSqlMap(EnterpriseUser.class));
		mmap.addAttribute(format, map);
		return mmap;
		
	}
}
