package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ConfigurableWebApplicationContext;

import com.example.service.TestClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {


	@Autowired Environment env;
	@Autowired TestClass testservice;
	@Autowired ConfigurableWebApplicationContext subContext;
	

	@Value("${db.driver}")
	private String dbDriver;

	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("들어옴");
		model.addAttribute("socialInfo", env.getProperty("facebookKey"));
		model.addAttribute("dbDriver", dbDriver);
		model.addAttribute("message", testservice.helloMessage());
		return "index";
	}
	
	@RequestMapping("/log")
	@ResponseBody
	public String index2(){
		 String[] profiles = subContext.getEnvironment().getActiveProfiles();
		 if( profiles.length==0 ){
	            profiles = subContext.getEnvironment().getDefaultProfiles();
	     }
		 
		 
		log.info("프로파일들", profiles[0]);
		log.info("인포!");
		log.debug("디버그 메시지");
		return "hello";
	}

	

}
