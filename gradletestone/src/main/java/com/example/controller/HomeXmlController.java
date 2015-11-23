package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.TestClass;

@Controller
public class HomeXmlController {

	@Autowired TestClass testservice;
	
	@Value("${facebookKey}")
	private String facebookKey;
	
	@Value("${db.driver}")
    private String dbDriver;
	
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("들어옴");
		model.addAttribute("socialInfo", facebookKey);
		model.addAttribute("dbDriver", dbDriver);
		model.addAttribute("message", testservice.helloMessage());
		return "index";
	}
	
	
	@RequestMapping("/tagtest")
	public String tagtest() {
		return "tagtest";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}

}
