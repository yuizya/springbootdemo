package com.susanna.smoneybag.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.susanna.smoneybag.mapper")
public class UserMapperTest {
	@Autowired
	private UserMapper target;
	@Test
	public void testFetchById() {
		System.out.println(target.fetchById(2L));
	}

}
