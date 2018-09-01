package com.ubs.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication(scanBasePackages= {"com.ubs.controller","com.ubs.config"})
@EnableWebMvc
public class BootApp {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		SpringApplication.run(BootApp.class, args);

	}

}
