package com.apps.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common")
public class GeneralAPI {
  @PostMapping("")
  public String processInfo(@RequestParam String name,@RequestParam String skill) {
	  return "Hey"+name+"  with skill: "+skill;
  }
  
}
