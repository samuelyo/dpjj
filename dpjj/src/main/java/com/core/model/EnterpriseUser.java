package main.java.com.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;
import main.java.com.core.annotationsDef.SignalSetter;
import main.java.com.core.log.model.User;


@DbInfo(tableName = "enterprise_user")
public class EnterpriseUser implements User,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Columns(column = "enterprise_user_id")
	private String   enterpriseUserId  ; 
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "enterprise_user_name")
	private String enterpriseUserName ;
	
	@Size(min = 1,max=16)
	@NotNull
	@Columns(column = "enterprise_user_password")
	private String enterpriseUserPasswd ;
	
	@Size(min = 1,max=64)
	@NotNull
	@Columns(column = "enterprise_user_openid")
	private String enterpriseUserWeChatOpenid ;//微信openid
	
	@Size(min = 1,max=128)
	@NotNull
	@Columns(column = "enterprise_name")
	private String enterpriseName ;
	
	@Columns(column = "proof_path")
	private String proofPaths; //证明材料改名后的存储路径（包括文件按名和文件扩展名,多个材料用“|”隔开） 
	
	@Columns(column = "proof_name")
	private String proofNames; //证明材料的原有名称（包括文件按名和文件扩展名,多个材料用“|”隔开，顺序与上一字段path的排列顺序相同）
	
	@Size(min = 1,max=16)
	@NotNull
	@Columns(column = "representative_name")
	private String representativeName;
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "representative_idcard")
	private String representativeIDcard;
	
	@Size(min = 1,max=32)
	@NotNull
	@Columns(column = "representative_phone")
	private String representativePhone ;//其他联系人
	
	@Size(min = 1,max=64)
	@NotNull
	@Columns(column = "representative_email")
	private String representativeEmail ;
	
	@Columns(column = "update_time")
	private Date   updateTime ;
	
	
	public EnterpriseUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnterpriseUser(String entrepriseUserId, String entrepriseUserName,
			String entrepriseUserPasswd, String entrepriseUserWeChatOpenid,
			String enterpriseName, String proofPath, String representativeName,
			String representativeIDcard, String representativePhone,
			String representativeEmail, Date updateTime) {
		super();
		this.enterpriseUserId = entrepriseUserId;
		this.enterpriseUserName = entrepriseUserName;
		this.enterpriseUserPasswd = entrepriseUserPasswd;
		this.enterpriseUserWeChatOpenid = entrepriseUserWeChatOpenid;
		this.enterpriseName = enterpriseName;
		this.proofPaths = proofPath;
		this.representativeName = representativeName;
		this.representativeIDcard = representativeIDcard;
		this.representativePhone = representativePhone;
		this.representativeEmail = representativeEmail;
		this.updateTime = updateTime;
	}
	public String getUserId() {
		return enterpriseUserId;
	}
	@SignalSetter(column = "enterprise_user_id")
	public void setEntrepriseUserId(String entrepriseUserId) {
		this.enterpriseUserId = entrepriseUserId;
	}
	public String getUserName() {
		return enterpriseUserName;
	}
	@SignalSetter(column = "enterprise_user_name")
	public void setEntrepriseUserName(String entrepriseUserName) {
		this.enterpriseUserName = entrepriseUserName;
	}
	public String getUserPasswd() {
		return enterpriseUserPasswd;
	}
	@SignalSetter(column = "enterprise_user_password")
	public void setEntrepriseUserPasswd(String entrepriseUserPasswd) {
		this.enterpriseUserPasswd = entrepriseUserPasswd;
	}
	public String getEntrepriseUserWeChatOpenid() {
		return enterpriseUserWeChatOpenid;
	}
	@SignalSetter(column = "enterprise_user_openid")
	public void setEntrepriseUserWeChatOpenid(String entrepriseUserWeChatOpenid) {
		this.enterpriseUserWeChatOpenid = entrepriseUserWeChatOpenid;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	@SignalSetter(column = "enterprise_name")
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getProofPath() {
		return proofPaths;
	}
	@SignalSetter(column = "proof_path")
	public void setProofPath(String proofPath) {
		this.proofPaths = proofPath;
	}
	public String getRepresentativeName() {
		return representativeName;
	}
	@SignalSetter(column = "representative_name")
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}
	public String getRepresentativeIDcard() {
		return representativeIDcard;
	}
	@SignalSetter(column = "representative_idcard")
	public void setRepresentativeIDcard(String representativeIDcard) {
		this.representativeIDcard = representativeIDcard;
	}
	public String getRepresentativePhone() {
		return representativePhone;
	}
	@SignalSetter(column = "representative_phone")
	public void setRepresentativePhone(String representativePhone) {
		this.representativePhone = representativePhone;
	}
	public String getRepresentativeEmail() {
		return representativeEmail;
	}
	@SignalSetter(column = "representative_email")
	public void setRepresentativeEmail(String representativeEmail) {
		this.representativeEmail = representativeEmail;
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
		EnterpriseUser other = (EnterpriseUser) obj;
		if (enterpriseName == null) {
			if (other.enterpriseName != null)
				return false;
		} else if (!enterpriseName.equals(other.enterpriseName))
			return false;
		if (enterpriseUserId != other.enterpriseUserId)
			return false;
		if (enterpriseUserName == null) {
			if (other.enterpriseUserName != null)
				return false;
		} else if (!enterpriseUserName.equals(other.enterpriseUserName))
			return false;
		if (enterpriseUserPasswd == null) {
			if (other.enterpriseUserPasswd != null)
				return false;
		} else if (!enterpriseUserPasswd.equals(other.enterpriseUserPasswd))
			return false;
		if (enterpriseUserWeChatOpenid == null) {
			if (other.enterpriseUserWeChatOpenid != null)
				return false;
		} else if (!enterpriseUserWeChatOpenid
				.equals(other.enterpriseUserWeChatOpenid))
			return false;
		if (proofPaths == null) {
			if (other.proofPaths != null)
				return false;
		} else if (!proofPaths.equals(other.proofPaths))
			return false;
		if (representativeEmail == null) {
			if (other.representativeEmail != null)
				return false;
		} else if (!representativeEmail.equals(other.representativeEmail))
			return false;
		if (representativeIDcard == null) {
			if (other.representativeIDcard != null)
				return false;
		} else if (!representativeIDcard.equals(other.representativeIDcard))
			return false;
		if (representativeName == null) {
			if (other.representativeName != null)
				return false;
		} else if (!representativeName.equals(other.representativeName))
			return false;
		if (representativePhone == null) {
			if (other.representativePhone != null)
				return false;
		} else if (!representativePhone.equals(other.representativePhone))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EntrepriseUser [entrepriseUserId=" + enterpriseUserId
				+ ", entrepriseUserName=" + enterpriseUserName
				+ ", entrepriseUserPasswd=" + enterpriseUserPasswd
				+ ", entrepriseUserWeChatOpenid=" + enterpriseUserWeChatOpenid
				+ ", enterpriseName=" + enterpriseName + ", proofPath="
				+ proofPaths + ", representativeName=" + representativeName
				+ ", representativeIDcard=" + representativeIDcard
				+ ", representativePhone=" + representativePhone
				+ ", representativeEmail=" + representativeEmail
				+ ", updateTime=" + updateTime + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
