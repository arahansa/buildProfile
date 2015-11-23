package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import javax.validation.Valid;

@Slf4j
@Controller
public class ValidController {
	
	@RequestMapping("/valid")
	public String valid(@Valid TestUser testUser, BindingResult errors){
		if(errors.hasErrors()){
			log.debug("error");
			System.out.println("error!! ");
		}
		log.debug("form :: {}", testUser);
		System.out.println("form : "+testUser);
		return "form";
	}

}
