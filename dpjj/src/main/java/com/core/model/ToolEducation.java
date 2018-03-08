package main.java.com.core.model;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

/**
 * 教育水平编码
 * @author 
 *
 */
@DbInfo(tableName = "tool_education")
public class ToolEducation {
	
	@Columns(column = "education_level_code")
	private short educationLevelCode;
	
	@Columns(column = "education_level_name")
	private String educationLevelName;
	
	public short getEducationLevelCode() {
		return educationLevelCode;
	}
	public void setEducationLevelCode(short educationLevelCode) {
		this.educationLevelCode = educationLevelCode;
	}
	public String getEducationLevelName() {
		return educationLevelName;
	}
	public void setEducationLevelName(String educationLevelName) {
		this.educationLevelName = educationLevelName;
	}
	
	
	
}
