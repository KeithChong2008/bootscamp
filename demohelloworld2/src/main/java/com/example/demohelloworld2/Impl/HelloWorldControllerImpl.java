package com.example.demohelloworld2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demohelloworld2.HelloWorldController;

import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
//@Configuration
//@EnableAutoConfiguation
//@ComponentScan (Most Important)

//CompoentScan is to scan @Controller, @Service, @Repository, @Configuation
//If yes,create an object of those classes 
//and put that object into SpringContext



@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")

public class HelloWorldControllerImpl implements HelloWorldController {

	
	
	public String HelloWorld(){
		return "Hello World. I am Keith!";
	}

}
