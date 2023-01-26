package com.springMVC.controller;

//create dynamic project, then project right click->configure->convert to mave project
//properties->javacompiler->11 && projects facets->click->jre 11
//add views folder in src->main->webapp->web-inf->views
//add spring-servlet.xml to src->main->webapp->web-inf
//add pom dependencies , web.xml, spring-servlet.xml, views contains jsp/html file
//add details in mycontroller mappings
//right click properties->deployment assembly->add->java build path entities->finish
//run by right click project -> run as -> server

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
	public String showMessage() {
		return "hello";	
	}
    
    @RequestMapping("/index")
   	public String showMessageindex() {
   		return "index";	
   	}
    @RequestMapping("/home")
   	public String showMessagehome() {
   		return "home";	
   	}
}


