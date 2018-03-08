package main.java.com.ecmodule.dao;

import main.java.com.core.model.InsuranceEnterprise;

public interface InsuranceEnterpriseDao {
	public boolean add(InsuranceEnterprise insuranceEnterprise);
	public boolean delete(int id);
	public InsuranceEnterprise find(int id);
	public boolean update(InsuranceEnterprise insuranceEnterprise);
}
