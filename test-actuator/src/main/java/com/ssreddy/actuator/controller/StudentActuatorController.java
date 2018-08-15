package com.ssreddy.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentActuatorController {

	@GetMapping(value="/testact/{name}")
	public String actuatorTest(@PathVariable("name") String name) {
		return "Hello "+name+", Welcome to Spring Boot World!. "; 
	}
	
	
}
