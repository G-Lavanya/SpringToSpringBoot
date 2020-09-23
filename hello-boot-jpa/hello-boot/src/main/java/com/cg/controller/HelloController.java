package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value = "message")
	public String[] sayHello(){
		
		String[] messages = new String[] {
												"Hello, World","Welcome to REST world"
											};
		
		return messages;
	}
}
