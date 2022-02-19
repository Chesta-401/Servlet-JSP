package com.ymsli.productapp.model.service;

import java.util.Optional;

import com.ymsli.productapp.model.persistence.user.User;
import com.ymsli.productapp.model.persistence.user.UserDao;
import com.ymsli.productapp.model.persistence.user.UserDaoImpl;

public class UserServiceImpl implements UserService{
	UserDao userDao;
	public UserServiceImpl(){
		userDao=new UserDaoImpl();
	}
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	@Override
	public Optional<User> getUser(String username, String password) {
		return userDao.getUser(username, password);
	}

}
