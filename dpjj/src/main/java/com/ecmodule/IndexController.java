package main.java.com.ecmodule;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import main.java.com.core.databaseUtil.SQLRespository;
import main.java.com.core.model.Developer;
import main.java.com.core.model.InsuranceEnterprise;
import main.java.com.ecmodule.dao.InsuranceEnterpriseDao;

@Controller
public class IndexController {
	@Autowired
	private InsuranceEnterpriseDao insuranceEnterpriseDao;
	
	
	@RequestMapping("/ecmodule")
	public String index(ModelMap model) {
		InsuranceEnterprise insuranceEnterprise = insuranceEnterpriseDao.find(1);
		model.addAttribute("message", 
				insuranceEnterprise.getEnterpriseName());
		
		return "index";
	}
	
	@RequestMapping("/json")
	@ResponseBody 
	public String test(ModelMap model) {
		String sql = SQLRespository.getInsertSqlMap(Developer.class);
		
		return sql;
	}
}
