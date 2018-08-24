package com.zqdl.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("demo-provide")
public interface FeignClientService {

	@RequestMapping(value="demo",method=RequestMethod.POST)
	String demoString();
	
	@RequestMapping("user/queryList")
	String queryUserList();
	
}
