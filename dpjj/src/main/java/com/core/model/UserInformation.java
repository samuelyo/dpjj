package main.java.com.core.model;

import java.util.Date;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

/**
 * 用户档案信息
 * @author 
 *
 */
@DbInfo(tableName = "user_information")
public class UserInformation {
	
	@Columns(column = "user_id")
	private long userId;
	
	@Columns(column = "user_age")
	private short userAge;
	
	@Columns(column = "user_gender")
	private String userGender;
	
	@Columns(column = "user_nation_code")
	private short userNationCode;
	
	@Columns(column = "education_level_code")
	private short educationLevelCode;
	
	@Columns(column = "study_area")
	private short studyArea;
	
	@Columns(column = "work_area")
	private short workArea;
	
	@Columns(column = "is_married")
	private short isMarried;
	
	@Columns(column = "have_children_number")
	private short haveChildrenNumber;
	
	@Columns(column = "is_having_job")
	private String isHavingJob;
	
	@Columns(column = "oldman_number")
	private short oldmanNumber;
	
	@Columns(column = "salary_level_code")
	private short salaryLevelCode;
	
	@Columns(column = "have_insurance")
	private String haveInsurance;
	
	@Columns(column = "categorys_insurance")
	private int categorysInsurance;  
	
	@Columns(column = "create_time")
	private Date createTime;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public short getUserAge() {
		return userAge;
	}
	public void setUserAge(short userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public short getUserNationCode() {
		return userNationCode;
	}
	public void setUserNationCode(short userNationCode) {
		this.userNationCode = userNationCode;
	}
	public short getEducationLevelCode() {
		return educationLevelCode;
	}
	public void setEducationLevelCode(short educationLevelCode) {
		this.educationLevelCode = educationLevelCode;
	}
	public short getStudyArea() {
		return studyArea;
	}
	public void setStudyArea(short studyArea) {
		this.studyArea = studyArea;
	}
	public short getWorkArea() {
		return workArea;
	}
	public void setWorkArea(short workArea) {
		this.workArea = workArea;
	}
	public short getIsMarried() {
		return isMarried;
	}
	public void setIsMarried(short isMarried) {
		this.isMarried = isMarried;
	}
	public short getHaveChildrenNumber() {
		return haveChildrenNumber;
	}
	public void setHaveChildrenNumber(short haveChildrenNumber) {
		this.haveChildrenNumber = haveChildrenNumber;
	}
	public String getIsHavingJob() {
		return isHavingJob;
	}
	public void setIsHavingJob(String isHavingJob) {
		this.isHavingJob = isHavingJob;
	}
	public short getOldmanNumber() {
		return oldmanNumber;
	}
	public void setOldmanNumber(short oldmanNumber) {
		this.oldmanNumber = oldmanNumber;
	}
	public short getBalanceLevelCode() {
		return salaryLevelCode;
	}
	public void setBalanceLevelCode(short salaryLevelCode) {
		this.salaryLevelCode = salaryLevelCode;
	}
	public String getHaveInsurance() {
		return haveInsurance;
	}
	public void setHaveInsurance(String haveInsurance) {
		this.haveInsurance = haveInsurance;
	}
	public int getCategorysInsurance() {
		return categorysInsurance;
	}
	public void setCategorysInsurance(int categorysInsurance) {
		this.categorysInsurance = categorysInsurance;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
