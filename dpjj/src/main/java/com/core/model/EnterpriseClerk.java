package main.java.com.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;
import main.java.com.core.annotationsDef.SignalSetter;
import main.java.com.core.log.model.User;


@DbInfo(tableName = "clerk")
public class EnterpriseClerk implements User,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Columns(column = "clerk_id")
	private String   clerkId ;
	
	@Columns(column = "enterprise_user_id")
	private String   enterpriseUserId  ; 
	
	@Size(min = 1,max=16)
	@NotNull
	@Columns(column = "clerk_nickname")
	private String clerkNickname ;
	
	@Size(min = 1,max=16)
	@NotNull
	@Columns(column = "clerk_password")
	private String clerkPasswd ;
	
	@Size(min = 1,max=64)
	@NotNull
	@Columns(column = "clerk_openid")
	private String clerkWeChatOpenid ;//Î¢ÐÅopenid
	
	@Size(min = 1,max=16)
	@NotNull
	@Columns(column = "clerk_name")
	private String clerkName;
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "clerk_idcard")
	private String clerkIDcard;
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "clerk_phone")
	private String clerkPhone ;
	
	@Size(min = 1,max=64)
	@NotNull
	@Columns(column = "clerk_email")
	private String clerkEmail ;
	
	@Columns(column = "update_time")
	private Date   updateTime ;
	
	
	public EnterpriseClerk() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EnterpriseClerk(String clerkId, String entrepriseUserId,
			String clerkNickname, String clerkPasswd, String clerkWeChatOpenid,
			String clerkName, String clerkIDcard, String clerkPhone,
			String clerkEmail, Date updateTime) {
		super();
		this.clerkId = clerkId;
		this.enterpriseUserId = entrepriseUserId;
		this.clerkNickname = clerkNickname;
		this.clerkPasswd = clerkPasswd;
		this.clerkWeChatOpenid = clerkWeChatOpenid;
		this.clerkName = clerkName;
		this.clerkIDcard = clerkIDcard;
		this.clerkPhone = clerkPhone;
		this.clerkEmail = clerkEmail;
		this.updateTime = updateTime;
	}


	public String getUserId() {
		return clerkId;
	}

	@SignalSetter(column = "clerk_id")
	public void setClerkId(String clerkId) {
		this.clerkId = clerkId;
	}


	public String getEntrepriseUserId() {
		return enterpriseUserId;
	}

	@SignalSetter(column = "enterprise_id")
	public void setEntrepriseUserId(String entrepriseUserId) {
		this.enterpriseUserId = entrepriseUserId;
	}


	public String getUserName() {
		return clerkNickname;
	}

	@SignalSetter(column = "clerk_nickname")
	public void setClerkNickname(String clerkNickname) {
		this.clerkNickname = clerkNickname;
	}


	public String getUserPasswd() {
		return clerkPasswd;
	}

	@SignalSetter(column = "clerk_password")
	public void setClerkPasswd(String clerkPasswd) {
		this.clerkPasswd = clerkPasswd;
	}


	public String getClerkWeChatOpenid() {
		return clerkWeChatOpenid;
	}

	@SignalSetter(column = "clerk_openid")
	public void setClerkWeChatOpenid(String clerkWeChatOpenid) {
		this.clerkWeChatOpenid = clerkWeChatOpenid;
	}


	public String getClerkName() {
		return clerkName;
	}

	@SignalSetter(column = "clerk_name")
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}


	public String getClerkIDcard() {
		return clerkIDcard;
	}

	@SignalSetter(column = "clerk_idcard")
	public void setClerkIDcard(String clerkIDcard) {
		this.clerkIDcard = clerkIDcard;
	}


	public String getClerkPhone() {
		return clerkPhone;
	}

	@SignalSetter(column = "clerk_phone")
	public void setClerkPhone(String clerkPhone) {
		this.clerkPhone = clerkPhone;
	}


	public String getClerkEmail() {
		return clerkEmail;
	}

	@SignalSetter(column = "clerk_email")
	public void setClerkEmail(String clerkEmail) {
		this.clerkEmail = clerkEmail;
	}


	public Date getUpdateTime() {
		return updateTime;
	}

	@SignalSetter(column = "update_time")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	
	
}
