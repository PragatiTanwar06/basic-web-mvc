package com.springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value="/welcome")
	public String sayWelcome()
	{
		return "welcome";
	}
}
