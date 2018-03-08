package main.java.com.ecmodule.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import main.java.com.core.model.InsuranceEnterprise;
import main.java.com.ecmodule.dao.InsuranceEnterpriseDao;

@Repository("insuranceEnterpriseDao")
public class InsuranceEnterpriseDaoImpl implements InsuranceEnterpriseDao {
	
	/**
	 * JdbcTemplate
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public RowMapper<InsuranceEnterprise> getRowMapper() {
		return new BeanPropertyRowMapper<InsuranceEnterprise>(InsuranceEnterprise.class);
	}
	
	@Override
	public boolean add(InsuranceEnterprise insuranceEnterprise) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InsuranceEnterprise find(int id) {
		return jdbcTemplate.queryForObject("select * from insurance_enterprise WHERE id = ?", getRowMapper(), id);
	}

	@Override
	public boolean update(InsuranceEnterprise insuranceEnterprise) {
		// TODO Auto-generated method stub
		return false;
	}

}
