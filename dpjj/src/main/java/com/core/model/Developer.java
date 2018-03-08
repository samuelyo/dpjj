package main.java.com.core.model;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

@DbInfo(tableName = "developer")
public class Developer {
	
	@Columns(column = "name")
	private String name = "";
	
	@Columns(column = "school")
	private String school = "";
	
	@Columns(column = "speciality")
	private String speciality = "";
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(String name, String school, String speciality) {
		super();
		this.name = name;
		this.school = school;
		this.speciality = speciality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@Override
	public String toString() {
		return "Developer is" + school + ", " +speciality 
				+ ", " + name + "!";
	}
	
}
