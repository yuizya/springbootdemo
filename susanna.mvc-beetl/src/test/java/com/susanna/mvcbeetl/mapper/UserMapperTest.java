package com.susanna.mvcbeetl.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.susanna.mvcbeetl.mapper")
public class UserMapperTest {
	@Autowired
	private UserMapper target;
	@Test
	public void testGetUserById() {
		System.out.println(target.getUserById(1L));
	}

}
