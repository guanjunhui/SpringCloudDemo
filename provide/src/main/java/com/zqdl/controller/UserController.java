package com.zqdl.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zqdl.entity.User;
import com.zqdl.servide.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("queryList")
	public String queryUserList() {
		List<User> users = userService.queryUserList();
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writeValueAsString(users);
			logger.info("查询用户信息:"+json);
		} catch (JsonProcessingException e) {
			logger.error("查询用户信息异常", e);
		}
		return json;
	}
	
}
