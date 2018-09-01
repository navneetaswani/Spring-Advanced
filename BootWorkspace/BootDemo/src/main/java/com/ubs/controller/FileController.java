package com.ubs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
	
	
	@RequestMapping(value="/test")	
	public String viewHome() {	
		System.out.println("Inside View Home");
		return "index";
	}
	

}
