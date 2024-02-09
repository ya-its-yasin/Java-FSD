package com.tcs.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping("/hello") 
	public String method()
	{
		System.out.println("from WelcomeController");
		return "welcome";
	}
}
