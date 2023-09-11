package com.example.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")// version 1 api set
public class HelloWorldController {
  
@GetMapping(value = "/helloworld")
  public String helloworld(){
    return "Hello World. I am Keith.";
  }
}
