package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(value="/")
	public String returnHello() {
		return " welcome to jenkins and spring boot aplication";
	}
	

}
