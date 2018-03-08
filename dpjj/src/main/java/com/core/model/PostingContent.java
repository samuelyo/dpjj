package main.java.com.core.model;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

/**
 * ��������
 */

@DbInfo(tableName = "posting_content")
public class PostingContent {
	
	@Columns(column = "posting_original_id")
	private long postingOriginalId;
	
	@Columns(column = "posting_content")
	private String postingContent;
	
	@Columns(column = "pictures_path")
	private String picturesPath;    //����¼ͼƬ��ԭʼ����
	
	public long getPostingOriginalId() {
		return postingOriginalId;
	}
	public void setPostingOriginalId(long postingOriginalId) {
		this.postingOriginalId = postingOriginalId;
	}
	public String getPostingContent() {
		return postingContent;
	}
	public void setPostingContent(String postingContent) {
		this.postingContent = postingContent;
	}
	public String getPicturesPath() {
		return picturesPath;
	}
	public void setPicturesPath(String picturesPath) {
		this.picturesPath = picturesPath;
	}
	
	
}
