package main.java.com.core.login.dao.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.core.databaseUtil.JdbcUtil;
import main.java.com.core.log.model.User;
import main.java.com.core.login.dao.IUserDao;
import main.java.com.core.model.Admin;
import main.java.com.core.model.EnterpriseClerk;
import main.java.com.core.model.EnterpriseUser;
import main.java.com.core.model.GeneralUser;

public class UserDaoImpl implements IUserDao<User,String> {

	@Override
	public boolean insert(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findNowPageInfo(int nowpage, int pagesize, String sortName,
			String sortOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCountPage(int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletes(Object[] ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User checkLogin(String name, String pass,String role) {
		User entity = null;
		String[] args = new String[]{name,pass};
		String sql=null;
		ResultSet rs =null;
		switch(role){
		case "admin":	sql = "select * from admin where admin_name=? and admin_password=?";
        				try {
        					rs = JdbcUtil.getConn(sql,args);
        					if (rs.next()) {
        						entity = JdbcUtil.getEntity(Admin.class, rs);
        					}
        				} catch (SQLException|InstantiationException | IllegalAccessException
        						| IllegalArgumentException
        						| InvocationTargetException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				} 
        				break;
        				
		case "generalUser":	sql = "select * from user where user_name=? and user_password=?";
        					try {
        						rs = JdbcUtil.getConn(sql,args);
        						if (rs.next()) {
        							entity = JdbcUtil.getEntity(GeneralUser.class, rs);
        						}
        					} catch (SQLException|InstantiationException | IllegalAccessException
        							| IllegalArgumentException
        							| InvocationTargetException e) {
        						// TODO Auto-generated catch block
        						e.printStackTrace();
        					} 
        					break;
        					
		case "enterpriseUser":	sql = "select * from enterpriseuser where enterprise_user_name=? and enterprise_user_password=?";
        						try {
        							rs = JdbcUtil.getConn(sql,args);
        							if (rs.next()) {
        								entity = JdbcUtil.getEntity(EnterpriseUser.class, rs);
        							}
        						} catch (SQLException|InstantiationException | IllegalAccessException
        								| IllegalArgumentException
        								| InvocationTargetException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						} 
        						break;
		case "enterpriseClerk":	sql = "select * from clerk where clerk_nickname=? and clerk_password=?";
        						try {
        							rs = JdbcUtil.getConn(sql,args);
        							if (rs.next()) {
        								entity = JdbcUtil.getEntity(EnterpriseClerk.class, rs);
        							}
        						} catch (SQLException|InstantiationException | IllegalAccessException
        								| IllegalArgumentException
        								| InvocationTargetException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						} 
	
		}
        
        return entity;
	}

	@Override
	public User checkLoginByName(String name,String role) {
		// TODO Auto-generated method stub
		User entity = null;
		String[] args = new String[]{name};
		String sql=null;
		ResultSet rs =null;
		switch(role){
		case "admin":	sql = "select * from admin where admin_name=?";
        				try {
        					rs = JdbcUtil.getConn(sql,args);
        					if (rs.next()) {
        						entity = JdbcUtil.getEntity(Admin.class, rs);
        					}
        				} catch (SQLException|InstantiationException | IllegalAccessException
        						| IllegalArgumentException
        						| InvocationTargetException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				} 
        				break;
        				
		case "generalUser":	sql = "select * from user where user_name=?";
        					try {
        						rs = JdbcUtil.getConn(sql,args);
        						if (rs.next()) {
        							entity = JdbcUtil.getEntity(GeneralUser.class, rs);
        						}
        					} catch (SQLException|InstantiationException | IllegalAccessException
        							| IllegalArgumentException
        							| InvocationTargetException e) {
        						// TODO Auto-generated catch block
        						e.printStackTrace();
        					} 
        					break;
        					
		case "enterpriseUser":	sql = "select * from enterpriseuser where enterprise_user_name=?";
        						try {
        							rs = JdbcUtil.getConn(sql,args);
        							if (rs.next()) {
        								entity = JdbcUtil.getEntity(EnterpriseUser.class, rs);
        							}
        						} catch (SQLException|InstantiationException | IllegalAccessException
        								| IllegalArgumentException
        								| InvocationTargetException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						} 
        						break;
		case "enterpriseClerk":	sql = "select * from clerk where clerk_nickname=?";
        						try {
        							rs = JdbcUtil.getConn(sql,args);
        							if (rs.next()) {
        								entity = JdbcUtil.getEntity(EnterpriseClerk.class, rs);
        							}
        						} catch (SQLException|InstantiationException | IllegalAccessException
        								| IllegalArgumentException
        								| InvocationTargetException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						} 
	
		}
        
        return entity;
	}

	@Override
	public User checkLoginById(String Id,String role) {
		// TODO Auto-generated method stub
		User entity = null;
		String[] args = new String[]{Id};
		String sql=null;
		ResultSet rs =null;
		switch(role){
		case "admin":	sql = "select * from admin where admin_id=?";
        				try {
        					rs = JdbcUtil.getConn(sql,args);
        					if (rs.next()) {
        						entity = JdbcUtil.getEntity(Admin.class, rs);
        					}
        				} catch (SQLException|InstantiationException | IllegalAccessException
        						| IllegalArgumentException
        						| InvocationTargetException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				} 
        				break;
        				
		case "generalUser":	sql = "select * from user where user_id=?";
        					try {
        						rs = JdbcUtil.getConn(sql,args);
        						if (rs.next()) {
        							entity = JdbcUtil.getEntity(GeneralUser.class, rs);
        						}
        					} catch (SQLException|InstantiationException | IllegalAccessException
        							| IllegalArgumentException
        							| InvocationTargetException e) {
        						// TODO Auto-generated catch block
        						e.printStackTrace();
        					} 
        					break;
        					
		case "enterpriseUser":	sql = "select * from enterpriseuser where enterprise_user_id=?";
        						try {
        							rs = JdbcUtil.getConn(sql,args);
        							if (rs.next()) {
        								entity = JdbcUtil.getEntity(EnterpriseUser.class, rs);
        							}
        						} catch (SQLException|InstantiationException | IllegalAccessException
        								| IllegalArgumentException
        								| InvocationTargetException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						} 
        						break;
		case "enterpriseClerk":	sql = "select * from clerk where clerk_id=?";
        						try {
        							rs = JdbcUtil.getConn(sql,args);
        							if (rs.next()) {
        								entity = JdbcUtil.getEntity(EnterpriseClerk.class, rs);
        							}
        						} catch (SQLException|InstantiationException | IllegalAccessException
        								| IllegalArgumentException
        								| InvocationTargetException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						} 
	
		}
        
        return entity;
	}

	

}
