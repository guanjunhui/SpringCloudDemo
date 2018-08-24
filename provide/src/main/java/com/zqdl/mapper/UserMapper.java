package com.zqdl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zqdl.entity.User;

@Mapper//要有该注解,否则启动会报错,不能注入bean/springboot特有,普通SSM框架不需要添加该注解
public interface UserMapper {

	int saveUser(User user);
	
	int deleteUserById(User user);
	
	int editUser(User user);
	
	List<User> queryUserList();
	
}
