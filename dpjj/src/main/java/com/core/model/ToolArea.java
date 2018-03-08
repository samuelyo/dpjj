package main.java.com.core.model;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

/**
 * …Ê◊„¡Ï”Ú±‡¬Î
 * @author
 *
 */

@DbInfo(tableName = "tool_area")
public class ToolArea {
	
	@Columns(column = "area_code")
	private short areaCode;
	
	@Columns(column = "area_name")
	private String areaName;
	public short getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(short areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	
}
