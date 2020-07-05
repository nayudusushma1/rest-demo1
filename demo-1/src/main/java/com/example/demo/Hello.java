package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("hello")
	public String helloMsg() {
		return "Hello";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="hello")
	public String helloPostMsg() {
		return "HelloPOST";
	}

}
