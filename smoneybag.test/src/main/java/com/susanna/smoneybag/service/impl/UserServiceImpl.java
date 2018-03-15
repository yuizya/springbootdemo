package com.susanna.smoneybag.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susanna.smoneybag.entity.User;
import com.susanna.smoneybag.mapper.UserMapper;
import com.susanna.smoneybag.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User fetchById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.fetchById(id);
	}

}
