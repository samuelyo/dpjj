package main.java.com.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;
import main.java.com.core.annotationsDef.SignalSetter;
import main.java.com.core.log.model.User;


@DbInfo(tableName = "admin")
public class Admin implements User,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Columns(column = "admin_id",describe="主键")
	private String   adminId ;
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "admin_name")
	private String adminName ;
	
	@Size(min = 1,max=16)
	@NotNull
	@Columns(column = "admin_password")
	private String adminPasswd ;
	
	@Columns(column = "admin_level")
	private byte   adminLevel ;
	
	@Size(max=64)
	@NotNull
	@Columns(column = "admin_email")
	private String adminEmail;
	
	@Size(max=32)
	@NotNull
	@Columns(column = "admin_phone")
	private String adminPhone;
	
	@Size(max=32)
	@NotNull
	@Columns(column = "admin_colleague")
	private String adminColleague ;//其他联系人
	
	@Size(max=32)
	@NotNull
	@Columns(column = "admin_colleague_phone")
	private String adminColleaguePhone ;
	
	@Columns(column = "update_time")
	private Date   updateTime ;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String adminId, String adminName, String adminPasswd,
			byte adminLevel, String adminEmail, String adminPhone,
			String adminColleague, String adminColleaguePhone, Date updateTime) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPasswd = adminPasswd;
		this.adminLevel = adminLevel;
		this.adminEmail = adminEmail;
		this.adminPhone = adminPhone;
		this.adminColleague = adminColleague;
		this.adminColleaguePhone = adminColleaguePhone;
		this.updateTime = updateTime;
	}
	@Override
	public String getUserId() {
		return adminId;
	}
	@SignalSetter(column = "admin_id")
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	@Override
	public String getUserName() {
		return adminName;
	}
	@SignalSetter(column = "admin_name")
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	@Override
	public String getUserPasswd() {
		return adminPasswd;
	}
	@SignalSetter(column = "admin_password")
	public void setAdminPasswd(String adminPasswd) {
		this.adminPasswd = adminPasswd;
	}

	public byte getAdminLevel() {
		return adminLevel;
	}
	@SignalSetter(column = "admin_level")
	public void setAdminLevel(byte adminLevel) {
		this.adminLevel = adminLevel;
	}

	public String getAdminEmail() {
		return adminEmail;
	}
	@SignalSetter(column = "admin_email")
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPhone() {
		return adminPhone;
	}
	@SignalSetter(column = "admin_phone")
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public String getAdminColleague() {
		return adminColleague;
	}
	@SignalSetter(column = "admin_colleague")
	public void setAdminColleague(String adminColleague) {
		this.adminColleague = adminColleague;
	}

	public String getAdminColleaguePhone() {
		return adminColleaguePhone;
	}
	@SignalSetter(column = "admin_colleague_phone")
	public void setAdminColleaguePhone(String adminColleaguePhone) {
		this.adminColleaguePhone = adminColleaguePhone;
	}

	public Date getUpdateTime() {
		return updateTime;
	}
	@SignalSetter(column = "update_time")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName
				+ ", adminPasswd=" + adminPasswd + ", adminLevel=" + adminLevel
				+ ", adminEmail=" + adminEmail + ", adminPhone=" + adminPhone
				+ ", adminColleague=" + adminColleague
				+ ", adminColleaguePhone=" + adminColleaguePhone
				+ ", updateTime=" + updateTime + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (adminColleague == null) {
			if (other.adminColleague != null)
				return false;
		} else if (!adminColleague.equals(other.adminColleague))
			return false;
		if (adminColleaguePhone == null) {
			if (other.adminColleaguePhone != null)
				return false;
		} else if (!adminColleaguePhone.equals(other.adminColleaguePhone))
			return false;
		if (adminEmail == null) {
			if (other.adminEmail != null)
				return false;
		} else if (!adminEmail.equals(other.adminEmail))
			return false;
		if (adminId != other.adminId)
			return false;
		if (adminLevel != other.adminLevel)
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		if (adminPasswd == null) {
			if (other.adminPasswd != null)
				return false;
		} else if (!adminPasswd.equals(other.adminPasswd))
			return false;
		if (adminPhone == null) {
			if (other.adminPhone != null)
				return false;
		} else if (!adminPhone.equals(other.adminPhone))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}

	
	
}
