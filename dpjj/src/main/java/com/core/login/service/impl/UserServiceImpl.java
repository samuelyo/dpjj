package main.java.com.core.login.service.impl;

import java.util.List;

import javax.annotation.Resource;

import main.java.com.core.log.model.User;
import main.java.com.core.login.dao.IUserDao;
import main.java.com.core.login.dao.impl.UserDaoImpl;
import main.java.com.core.login.service.IUserService;

public class UserServiceImpl implements IUserService<User, String> {
	@Resource(type=UserDaoImpl.class)
	IUserDao<User,String> userDao ;
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
	public List<User> findNowPageInfo(int nowpage, int pagesize,
			String sortName, String sortOrder) {
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
	public User checkLogin(String name, String pass, String role) {
		// TODO Auto-generated method stub
		User user = userDao.checkLogin(name, pass, role);
		return user;
	}

	@Override
	public User checkLoginByName(String name, String role) {
		// TODO Auto-generated method stub
		User user = userDao.checkLoginByName(name, role);
		return user;
	}

	@Override
	public User checkLoginById(String id, String role) {
		// TODO Auto-generated method stub
		User user = userDao.checkLoginById(id, role);
		return user;
		
	}

	

}
