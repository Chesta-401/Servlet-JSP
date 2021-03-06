package com.ymsli.productapp.model.service;

import java.util.Optional;

import com.ymsli.productapp.model.persistence.user.User;

public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);	
}
