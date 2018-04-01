package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.SpringConfig;

@Controller
@RequestMapping("/")
public class URIController {

	private static final Logger log = LoggerFactory.getLogger(URIController.class);
	@Autowired
	SpringConfig sc;
	
	@RequestMapping(value="")
	public String test(){
		log.info("sc.salt={}",sc.getSalt());
		return "index";
	}
}
