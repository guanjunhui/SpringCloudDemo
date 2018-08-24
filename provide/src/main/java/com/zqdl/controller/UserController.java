package com.zqdl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zqdl.entity.User;
import com.zqdl.servide.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	//private static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("queryList")
	public List<User> queryUserList() {
		List<User> users = userService.queryUserList();
		return users;
	}
	
}
