package com.example.demohelloworld2.Service.impl;

import com.example.demohelloworld2.HelloWorldController;

public class HelloworldServiceImpl implements HelloWorldController {



  @Override
  public String generate(int x){
     if(x>100){
      return "Hello World";
     }
     return "ABC";
  }
  
}
