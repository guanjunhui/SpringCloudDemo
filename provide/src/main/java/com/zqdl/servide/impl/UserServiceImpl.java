package com.zqdl.servide.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zqdl.entity.User;
import com.zqdl.mapper.UserMapper;
import com.zqdl.servide.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int saveUser(User user) {
		return 0;
	}

	@Override
	public int deleteUserById(User user) {
		return 0;
	}

	@Override
	public int editUser(User user) {
		return 0;
	}

	@Override
	public List<User> queryUserList() {
		return userMapper.queryUserList();
	}

}
