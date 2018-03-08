package main.java.com.core.model;

import java.util.Date;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

@DbInfo(tableName = "temp_insurance_product_evaluate")
public class TempInsuranceProductEvaluate {
	
	private long   id;
	
	@Columns(column = "product_id")
	private long   productId  ;
	
	@Columns(column = "owner_user_id")
	private long   ownerUserId ;
	
	@Columns(column = "overall_score")
	private float  overallScore ;
	
	@Columns(column = "service_score")
	private float  serviceScore;
	
	@Columns(column = "positioning_score")
	private float  positioningScore;
	
	@Columns(column = "settlement_score")
	private float  settlementScore;
	
	@Columns(column = "comment_content")
	private String commentContent ;
	
	@Columns(column = "create_time")
	private Date   createTime ;
	
	public TempInsuranceProductEvaluate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TempInsuranceProductEvaluate(long productId, long ownerUserId,
			float overallScore, float serviceScore, float positioningScore,
			float settlementScore, String commentContent, Date createTime) {
		super();
		this.productId = productId;
		this.ownerUserId = ownerUserId;
		this.overallScore = overallScore;
		this.serviceScore = serviceScore;
		this.positioningScore = positioningScore;
		this.settlementScore = settlementScore;
		this.commentContent = commentContent;
		this.createTime = createTime;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	public float getOverallScore() {
		return overallScore;
	}
	public void setOverallScore(float overallScore) {
		this.overallScore = overallScore;
	}
	public float getServiceScore() {
		return serviceScore;
	}
	public void setServiceScore(float serviceScore) {
		this.serviceScore = serviceScore;
	}
	public float getPositioningScore() {
		return positioningScore;
	}
	public void setPositioningScore(float positioningScore) {
		this.positioningScore = positioningScore;
	}
	public float getSettlementScore() {
		return settlementScore;
	}
	public void setSettlementScore(float settlementScore) {
		this.settlementScore = settlementScore;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((commentContent == null) ? 0 : commentContent.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + Float.floatToIntBits(overallScore);
		result = prime * result + (int) (ownerUserId ^ (ownerUserId >>> 32));
		result = prime * result + Float.floatToIntBits(positioningScore);
		result = prime * result + (int) (productId ^ (productId >>> 32));
		result = prime * result + Float.floatToIntBits(serviceScore);
		result = prime * result + Float.floatToIntBits(settlementScore);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TempInsuranceProductEvaluate other = (TempInsuranceProductEvaluate) obj;
		if (commentContent == null) {
			if (other.commentContent != null)
				return false;
		} else if (!commentContent.equals(other.commentContent))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (Float.floatToIntBits(overallScore) != Float
				.floatToIntBits(other.overallScore))
			return false;
		if (ownerUserId != other.ownerUserId)
			return false;
		if (Float.floatToIntBits(positioningScore) != Float
				.floatToIntBits(other.positioningScore))
			return false;
		if (productId != other.productId)
			return false;
		if (Float.floatToIntBits(serviceScore) != Float
				.floatToIntBits(other.serviceScore))
			return false;
		if (Float.floatToIntBits(settlementScore) != Float
				.floatToIntBits(other.settlementScore))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TempInsuranceProductEvaluate [productId=" + productId
				+ ", ownerUserId=" + ownerUserId + ", overallScore="
				+ overallScore + ", serviceScore=" + serviceScore
				+ ", positioningScore=" + positioningScore
				+ ", settlementScore=" + settlementScore + ", commentContent="
				+ commentContent + ", createTime=" + createTime + "]";
	}
	
	
}
