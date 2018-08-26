package com.zqdl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value="demo",method=RequestMethod.GET)
	public String demo() {
		String json = "SpringCloudProviderDemo";
		int num = 1/0;
		return json;
	}
	
}
