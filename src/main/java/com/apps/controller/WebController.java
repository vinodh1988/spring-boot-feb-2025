package com.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apps.services.DataService;

@Controller
@RequestMapping("/web")
public class WebController {
	@Autowired
	private DataService service;
  @RequestMapping("/hello")
  public String firstone(ModelMap map) {
	  map.addAttribute("names",service.getNames());
	  return "home";
  }
}
