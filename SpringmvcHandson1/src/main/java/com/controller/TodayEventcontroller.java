package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TodayEventcontroller {
	@RequestMapping("/TodayEvent")
	public String redirect3()
	{
		return "TodayEvent";
	}
}
