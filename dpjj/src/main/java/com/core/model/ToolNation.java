package main.java.com.core.model;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

/**
 * Ãñ×å±àÂë
 * @author 
 *
 */
@DbInfo(tableName = "tool_nation")
public class ToolNation {
	@Columns(column = "nation_code")
	private short nationCode;
	
	@Columns(column = "nation_name")
	private String nationName;
	
	public short getNationCode() {
		return nationCode;
	}
	public void setNationCode(short nationCode) {
		this.nationCode = nationCode;
	}
	public String getNationName() {
		return nationName;
	}
	public void setNationName(String nationName) {
		this.nationName = nationName;
	}
	
	
}
