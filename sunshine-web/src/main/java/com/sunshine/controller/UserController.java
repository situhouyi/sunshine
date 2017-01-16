package com.sunshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunshine.service.UserService;

@Controller("userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getUser")
	@ResponseBody
	public String  getUser(){
		return userService.getUserInfo().getUsername();
	}
}
