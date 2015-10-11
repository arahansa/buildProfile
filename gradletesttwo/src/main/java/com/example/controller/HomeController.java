package com.example.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.TestClass;

@Controller
public class HomeController {

	@Autowired Environment env;
	@Autowired TestClass testservice;
	
	@Value("#{myXmlProps['facebookKey']}")
	private String facebookKey;
	
	@Value("#{myXmlProps['db.driver']}")
    private String dbDriver;
	
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("들어옴");
		model.addAttribute("socialInfo", facebookKey);
		model.addAttribute("dbDriver", dbDriver);
		model.addAttribute("message", testservice.helloMessage());
		return "index";
	}

}
