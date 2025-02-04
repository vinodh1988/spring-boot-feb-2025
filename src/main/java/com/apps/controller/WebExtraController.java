package com.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebExtraController {

	@RequestMapping("/extra")
	public String jspnew() {
		return "fun";
	}
}
