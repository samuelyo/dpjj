package main.java.com.core.model;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;


@DbInfo(tableName = "insurance_category")
public class InsuranceCategory {
	
	@Columns(column = "category_numeber")
	private short categoryNumeber;
	
	@Columns(column = "category_name")
	private String categoryName;
	
	public InsuranceCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsuranceCategory(short categoryNumeber, String categoryName) {
		super();
		this.categoryNumeber = categoryNumeber;
		this.categoryName = categoryName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + categoryNumeber;
		return result;
	}
	
	public short getCategoryNumeber() {
		return categoryNumeber;
	}
	public void setCategoryNumeber(short categoryNumeber) {
		this.categoryNumeber = categoryNumeber;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InsuranceCategory other = (InsuranceCategory) obj;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (categoryNumeber != other.categoryNumeber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InsuranceCategory [categoryNumeber=" + categoryNumeber
				+ ", categoryName=" + categoryName + "]";
	}
	
}
