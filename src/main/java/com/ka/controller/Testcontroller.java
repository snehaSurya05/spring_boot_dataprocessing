package com.ka.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ka.model.Employee;

public class Testcontroller {
	// http://localhost:8080/register

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Object registerEmployee(@RequestBody Employee employee) {
	    System.out.println(employee);
	    return employee;
	}

}
