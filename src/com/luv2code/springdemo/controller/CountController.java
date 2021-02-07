package com.luv2code.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.service.CounterServiceImpl;

/**
 * Countroller class to handle request
 * @author parikshit chauhan
 *
 */
@RestController
@RequestMapping("/counter")
public class CountController {
	
	@Autowired
	CounterServiceImpl counterService;
	
	@GetMapping("/increase")
	public String saveCustomer() {
		
		counterService.getAndIncreaseCount();
		 
		return "hello";
	}
	
}
