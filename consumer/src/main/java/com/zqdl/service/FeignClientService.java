package com.zqdl.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zqdl.entity.User;

@FeignClient("demo-provide")
public interface FeignClientService {

	@RequestMapping(value="demo",method=RequestMethod.POST)
	String demoString();
	
	@RequestMapping("user/queryList")
	List<User> queryUserList();
	
	@RequestMapping("user/saveUser")
	String saveUser(User user);
	
}
