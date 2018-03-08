package main.java.com.core.model;

import java.util.Date;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;


@DbInfo(tableName = "insurance_product")
public class InsuranceProduct {
	
	@Columns(column = "product_id")
	private long   productId ;
	
	@Columns(column = "product_name")
	private String productname ;
	
	@Columns(column = "enterprise_id")
	private long   enterpriseId  ;
	
	@Columns(column = "enterprise_name")
	private String enterpriseName;
	
	@Columns(column = "category_number")
	private String categoryNumber;
	
	@Columns(column = "product_introduce")
	private String productIntroduce ;
	
	@Columns(column = "update_time")
	private Date   updateTime ;

	public InsuranceProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsuranceProduct(long productId, String productname,
			long enterpriseId, String enterpriseName, String categoryNumber,
			String productIntroduce, Date updateTime) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.enterpriseId = enterpriseId;
		this.enterpriseName = enterpriseName;
		this.categoryNumber = categoryNumber;
		this.productIntroduce = productIntroduce;
		this.updateTime = updateTime;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public long getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(String categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getProductIntroduce() {
		return productIntroduce;
	}

	public void setProductIntroduce(String productIntroduce) {
		this.productIntroduce = productIntroduce;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoryNumber == null) ? 0 : categoryNumber.hashCode());
		result = prime * result + (int) (enterpriseId ^ (enterpriseId >>> 32));
		result = prime * result
				+ ((enterpriseName == null) ? 0 : enterpriseName.hashCode());
		result = prime * result + (int) (productId ^ (productId >>> 32));
		result = prime
				* result
				+ ((productIntroduce == null) ? 0 : productIntroduce.hashCode());
		result = prime * result
				+ ((productname == null) ? 0 : productname.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
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
		InsuranceProduct other = (InsuranceProduct) obj;
		if (categoryNumber == null) {
			if (other.categoryNumber != null)
				return false;
		} else if (!categoryNumber.equals(other.categoryNumber))
			return false;
		if (enterpriseId != other.enterpriseId)
			return false;
		if (enterpriseName == null) {
			if (other.enterpriseName != null)
				return false;
		} else if (!enterpriseName.equals(other.enterpriseName))
			return false;
		if (productId != other.productId)
			return false;
		if (productIntroduce == null) {
			if (other.productIntroduce != null)
				return false;
		} else if (!productIntroduce.equals(other.productIntroduce))
			return false;
		if (productname == null) {
			if (other.productname != null)
				return false;
		} else if (!productname.equals(other.productname))
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
		return "InsuranceProduct [productId=" + productId + ", productname="
				+ productname + ", enterpriseId=" + enterpriseId
				+ ", enterpriseName=" + enterpriseName + ", categoryNumber="
				+ categoryNumber + ", productIntroduce=" + productIntroduce
				+ ", updateTime=" + updateTime + "]";
	}
	
	
}
