package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ContactUscontroller {
	@RequestMapping("/ContactUs")
	public String redirect2()
	{
		return "ContactUs";
	}
}
