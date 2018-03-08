package main.java.com.core.model;

import java.util.Date;
/**
 * ÓÃ»§·¢Ìû
 * @author 
 *
 */


import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

@DbInfo(tableName = "posting_item")
public class PostingItem {
	
	@Columns(column = "posting_id")
	private long postingId;
	
	@Columns(column = "posting_user_id")
	private long postingUserId;
	
	@Columns(column = "posting_original_id")
	private long postingOriginalId;
	
	@Columns(column = "point_like_number")
	private int pointLikeNumber;
	
	@Columns(column = "comment_number")
	private int commentNumber;
	
	@Columns(column = "posting_outline_content")
	private String postingOutlineContent;
	
	@Columns(column = "posting_is_copied")
	private int postingIsCopied;
	
	@Columns(column = "thumbnails_path")
	private String thumbnailsPath;
	
	@Columns(column = "create_time")
	private Date createTime;
	private int category_number;
	
	
	public long getPostingId() {
		return postingId;
	}
	public void setPostingId(long postingId) {
		this.postingId = postingId;
	}
	public long getPostingUserId() {
		return postingUserId;
	}
	public void setPostingUserId(long postingUserId) {
		this.postingUserId = postingUserId;
	}
	public long getPostingOriginalId() {
		return postingOriginalId;
	}
	public void setPostingOriginalId(long postingOriginalId) {
		this.postingOriginalId = postingOriginalId;
	}
	public int getPointLikeNumber() {
		return pointLikeNumber;
	}
	public void setPointLikeNumber(int pointLikeNumber) {
		this.pointLikeNumber = pointLikeNumber;
	}
	public int getCommentNumber() {
		return commentNumber;
	}
	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}
	public String getPostingOutlineContent() {
		return postingOutlineContent;
	}
	public void setPostingOutlineContent(String postingOutlineContent) {
		this.postingOutlineContent = postingOutlineContent;
	}
	public int getPostingIsCopied() {
		return postingIsCopied;
	}
	public void setPostingIsCopied(int postingIsCopied) {
		this.postingIsCopied = postingIsCopied;
	}
	public String getThumbnailsPath() {
		return thumbnailsPath;
	}
	public void setThumbnailsPath(String thumbnailsPath) {
		this.thumbnailsPath = thumbnailsPath;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getCategory_number() {
		return category_number;
	}
	public void setCategory_number(int category_number) {
		this.category_number = category_number;
	}
	
	
}
