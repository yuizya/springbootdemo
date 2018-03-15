package com.susanna.smoneybag.mapper;

import com.susanna.smoneybag.entity.User;

public interface UserMapper {
	User fetchById(Long id);
}
