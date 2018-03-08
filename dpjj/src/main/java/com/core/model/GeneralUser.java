package main.java.com.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;
import main.java.com.core.annotationsDef.SignalSetter;
import main.java.com.core.log.model.User;


@DbInfo(tableName = "general_user")
public class GeneralUser implements User,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Columns(column = "user_id")
	private String   userId  ; 
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "user_name")
	private String userName ;
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "user_password")
	private String userPasswd ;
	
	@Size(min = 1,max=64)
	@NotNull
	@Columns(column = "user_openid")
	private String userWeChatOpenid ;//微信openid
	
	@Size(min = 1,max=16)
	@NotNull
	@Columns(column = "user_phone")
	private String userPhone ;//其他联系人
	
	@Size(min = 1,max=64)
	@NotNull
	@Columns(column = "user_email")
	private String userEmail ;
	
	@Columns(column = "update_time")
	private Date   updateTime ;
	
	public GeneralUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GeneralUser(String userId, String userName, String userPasswd,
			String userWeChatOpenid, String userPhone, String userEmail,
			Date updateTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.userWeChatOpenid = userWeChatOpenid;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.updateTime = updateTime;
	}
	public String getUserId() {
		return userId;
	}
	@SignalSetter(column = "user_id")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	@SignalSetter(column = "user_name")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPasswd() {
		return userPasswd;
	}
	@SignalSetter(column = "user_password")
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	public String getUserWeChatOpenid() {
		return userWeChatOpenid;
	}
	@SignalSetter(column = "user_openid")
	public void setUserWeChatOpenid(String userWeChatOpenid) {
		this.userWeChatOpenid = userWeChatOpenid;
	}
	public String getUserPhone() {
		return userPhone;
	}
	@SignalSetter(column = "user_phone")
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	@SignalSetter(column = "user_email")
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	@SignalSetter(column = "update_time")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneralUser other = (GeneralUser) obj;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPasswd == null) {
			if (other.userPasswd != null)
				return false;
		} else if (!userPasswd.equals(other.userPasswd))
			return false;
		if (userPhone == null) {
			if (other.userPhone != null)
				return false;
		} else if (!userPhone.equals(other.userPhone))
			return false;
		if (userWeChatOpenid == null) {
			if (other.userWeChatOpenid != null)
				return false;
		} else if (!userWeChatOpenid.equals(other.userWeChatOpenid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GeneralUser [userId=" + userId + ", userName=" + userName
				+ ", userPasswd=" + userPasswd + ", userWeChatOpenid="
				+ userWeChatOpenid + ", userPhone=" + userPhone
				+ ", userEmail=" + userEmail + ", updateTime=" + updateTime
				+ ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
