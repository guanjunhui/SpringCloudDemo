package com.zqdl.servide;

import java.util.List;

import com.zqdl.entity.User;

public interface UserService {

	int saveUser(User user);
	
	int deleteUserById(User user);
	
	int editUser(User user);
	
	List<User> queryUserList();
	
}
