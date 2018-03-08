package main.java.com.core.login.dao;

import main.java.com.core.baseDao.BaseDao;



public interface IUserDao<T, PK> extends BaseDao<T, PK> {
	public T checkLogin(String name,String pass,String role);
	public T checkLoginByName(String name,String role);
	public T checkLoginById(String Id,String role);
}
