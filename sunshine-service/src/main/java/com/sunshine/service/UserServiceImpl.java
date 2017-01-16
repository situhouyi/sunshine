package com.sunshine.service;

import org.springframework.stereotype.Service;

import com.sunshine.entity.User;
import com.sunshine.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public User getUserInfo() {
		User user = new User();
		user.setUsername("zhangsan11111");
		return user;
	}

}
