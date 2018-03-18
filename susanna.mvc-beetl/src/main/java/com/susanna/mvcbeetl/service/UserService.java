package com.susanna.mvcbeetl.service;

import java.util.List;

import com.susanna.mvcbeetl.entity.User;

public interface UserService {
	public List<User> allUser();
	public User getUserById(Long id);
	public void updateUser(Long id,Integer type);
}
