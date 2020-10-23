package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Homecontroller {
	
		@RequestMapping("/")  
	    public String redirect1()  
	    {  
	        return "home";  
	    }  
}
