package com.example.demohelloworld2;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloWorldController {

  @GetMapping(value = "/helloworld")
  String hello;
}
