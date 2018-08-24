package com.zqdl.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zqdl.service.FeignClientService;

@Controller
public class DemoController {

	@Autowired
	private FeignClientService feignClientService;
	
	@ResponseBody
	@RequestMapping(value="consumerDemo",method=RequestMethod.GET)
	public String consumerDemo() {
		return feignClientService.demoString();
	}
	
	@ResponseBody
	@RequestMapping("queryUserList")
	public String queryUserList() {
		return feignClientService.queryUserList();
	}
	
	@RequestMapping("index")
	public String index(Map<String, Object> map) {
		map.put("user", feignClientService.queryUserList());
		return "index";
	}
	
}
