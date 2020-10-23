package com.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController 
{    @RequestMapping("/Login")
	public String getLoginPage(Model model)
	{
	User user=new User();
	model.addAttribute("user",user);
		return "Login";
		
	}
@PostMapping("/loggedin")
public String processForm(@Valid @ModelAttribute User user,BindingResult result)
{
	if(result.hasErrors())
		return "Login";
	else
		return "loggedin";
}
}
