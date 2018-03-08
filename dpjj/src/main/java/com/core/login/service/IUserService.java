package main.java.com.core.login.service;

import main.java.com.core.baseService.BaseService;

public interface IUserService<T, PK> extends BaseService<T, PK> {
	 public T checkLogin(String name,String pass,String role);
	 public T checkLoginByName(String name,String role);
	 public T checkLoginById(String id,String role);
}
