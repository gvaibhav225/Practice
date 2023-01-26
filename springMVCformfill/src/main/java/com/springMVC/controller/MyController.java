package com.springMVC.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMVC.model.Employee;



@Controller
public class MyController {
    @RequestMapping("/")
	public String showMessage() {
		return "hello";	
	}
    
    @RequestMapping("/index")
   	public String showMessageindex(Model model) {
    	Employee obj=new Employee();
    	model.addAttribute("employee",obj);
   		return "index";	
   	}
    @RequestMapping("/home")
   	public String showMessagehome() {
   		return "home";	
   	}
    
    @RequestMapping("/submitform")
   	public String showMessagesubmit( @Valid @ModelAttribute("employee") Employee obj, BindingResult result) throws IOException {
    	if(result.hasErrors()) {
    		return "index";
    	}
    	else {

   		return "submitted";	
    	}
   	}
    
    
}
