package main.java.com.core.model;

import java.util.Date;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

@DbInfo(tableName = "insurance_product_comment")
public class InsuranceProductComment {
	
	private long   commentId;
	
	@Columns(column = "comment_product_id")
	private long   commentProductId;
	
	@Columns(column = "owner_user_id")
	private long   ownerUserId;
	
	@Columns(column = "comment_content")
	private String commentContent;
	
	@Columns(column = "create_time")
	private Date   createTime ;
	public InsuranceProductComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsuranceProductComment(long commentProductId, long ownerUserId,
			String commentContent, Date createTime) {
		super();
		this.commentProductId = commentProductId;
		this.ownerUserId = ownerUserId;
		this.commentContent = commentContent;
		this.createTime = createTime;
	}
	public long getCommentProductId() {
		return commentProductId;
	}
	public void setCommentProductId(long commentProductId) {
		this.commentProductId = commentProductId;
	}
	public long getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(long ownerUserId) {
		this.ownerUserId = ownerUserId;
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
				+ (int) (commentProductId ^ (commentProductId >>> 32));
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + (int) (ownerUserId ^ (ownerUserId >>> 32));
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
		InsuranceProductComment other = (InsuranceProductComment) obj;
		if (commentContent == null) {
			if (other.commentContent != null)
				return false;
		} else if (!commentContent.equals(other.commentContent))
			return false;
		if (commentProductId != other.commentProductId)
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (ownerUserId != other.ownerUserId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InsuranceProductComment [commentProductId=" + commentProductId
				+ ", ownerUserId=" + ownerUserId + ", commentContent="
				+ commentContent + ", createTime=" + createTime + "]";
	}
	
}
