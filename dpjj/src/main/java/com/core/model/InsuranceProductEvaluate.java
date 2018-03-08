/**
 * 
 */
package main.java.com.core.model;

import java.util.Date;

import main.java.com.core.annotationsDef.Columns;
import main.java.com.core.annotationsDef.DbInfo;

/**
 * @author jimmy-james
 *
 */

@DbInfo(tableName = "insurance_product_evaluate")
public class InsuranceProductEvaluate {
	
	
	
	@Columns(column = "product_id")
	private long   productId  ; 
	
	@Columns(column = "service_score")
	private float  serviceScore;
	
	@Columns(column = "positioning_score")
	private float  positioningScore;
	
	@Columns(column = "settlement_score")
	private float  settlementScore;
	
	public InsuranceProductEvaluate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsuranceProductEvaluate(long productId, float service_score,
			float positioning_score, float settlement_score) {
		super();
		this.productId = productId;
		this.serviceScore = service_score;
		this.positioningScore = positioning_score;
		this.settlementScore = settlement_score;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public float getService_score() {
		return serviceScore;
	}
	public void setService_score(float service_score) {
		this.serviceScore = service_score;
	}
	public float getPositioning_score() {
		return positioningScore;
	}
	public void setPositioning_score(float positioning_score) {
		this.positioningScore = positioning_score;
	}
	public float getSettlement_score() {
		return settlementScore;
	}
	public void setSettlement_score(float settlement_score) {
		this.settlementScore = settlement_score;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		InsuranceProductEvaluate other = (InsuranceProductEvaluate) obj;
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
		return "InsuranceProductEvaluate [productId=" + productId
				+ ", service_score=" + serviceScore + ", positioning_score="
				+ positioningScore + ", settlement_score=" + settlementScore
				+ "]";
	}
	
}
