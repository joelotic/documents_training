package com.eazybytes.hellowordservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@GetMapping(value =  "/hello2")
	public  String sayHello2(){
		return "Hello";
	}
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello, Welcome to course on Microservices";
	}


}
