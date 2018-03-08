package main.java.com.core.model;

import java.util.Date;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

/**
 * ”√ªß∆¿¬€
 */

@DbInfo(tableName = "posting_comment")
public class PostingComment {
	

	private long commentId;
	
	@Columns(column = "posting_id")
	private long postingId;
	
	@Columns(column = "owner_user_id")
	private long ownerUserId;
	
	@Columns(column = "comment_content")
	private String commentContent;
	
	@Columns(column = "create_time")
	private Date createTime;
	
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public long getPostingId() {
		return postingId;
	}
	public void setPostingId(long postingId) {
		this.postingId = postingId;
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
	
	
}
