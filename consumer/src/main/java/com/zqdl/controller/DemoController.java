package com.zqdl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zqdl.service.FeignClientService;

@RestController
public class DemoController {

	@Autowired
	private FeignClientService feignClientService;
	
	@RequestMapping(value="consumerDemo",method=RequestMethod.GET)
	public String consumerDemo() {
		return feignClientService.demoString();
	}
	
	@RequestMapping("queryUserList")
	public String queryUserList() {
		return feignClientService.queryUserList();
	}
	
}
