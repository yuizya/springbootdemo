package com.susanna.mvcbeetl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susanna.mvcbeetl.entity.User;
import com.susanna.mvcbeetl.mapper.UserMapper;
import com.susanna.mvcbeetl.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public List<User> allUser() {
		return sampleUser(5);
	}
	
	

	public User getUserById(Long id) {
		return userMapper.getUserById(id);
	}

	
	private List<User> sampleUser(int num){
		List<User> list = new ArrayList<User>(num);
		for(int i=0;i<num;i++){
			User user = new User();
			user.setId((long)i);
			user.setUsername("mame"+i);
			list.add(user);
		}
		return list;
	}


	public void updateUser(Long id, Integer type) {
		// TODO Auto-generated method stub
		
	}
}
