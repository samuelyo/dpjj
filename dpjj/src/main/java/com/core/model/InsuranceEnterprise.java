package main.java.com.core.model;

import java.util.Date;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

@DbInfo(tableName = "insurance_entreprise")
public class InsuranceEnterprise {
	
	@Columns(column = "id")
	private String id;
	
	@Columns(column = "enterprise_name")
	private String enterpriseName;
	
	@Columns(column = "owner_number")
	private String ownerNumber;
	
	@Columns(column = "relevant_enterprise_user_id")
	private int relevantEntrepriseUserId;
	
	@Columns(column = "update_time")
	private Date updateTime;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getOwnerNumber() {
		return ownerNumber;
	}
	public void setOwnerNumber(String ownerNumber) {
		this.ownerNumber = ownerNumber;
	}
	public int getRelevantEntrepriseUserId() {
		return relevantEntrepriseUserId;
	}
	public void setRelevantEntrepriseUserId(int relevantEntrepriseUserId) {
		this.relevantEntrepriseUserId = relevantEntrepriseUserId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
