package com.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apps.services.DataService;
import com.apps.utils.ApplicationState;
import com.apps.utils.SessionState;

@Controller
@RequestMapping("/web")
public class WebController {
	@Autowired
	private DataService service;
	@Autowired 
	private SessionState ss;
	@Autowired
	private ApplicationState as;
	
  @RequestMapping("/hello")
  public String firstone(ModelMap map) {
	  map.addAttribute("names",service.getNames());
	  ss.setState();
	  as.setState();
	  map.addAttribute("sdata",ss.getState());
	  map.addAttribute("adata",as.getState());
	  return "home";
  }
}
