package com.tcs.entity;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/go")
public class WelcomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String method()
	{
		System.out.println("from controller..");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		DataSource ds = (DataSource) context.getBean("dataSource");
		System.out.println(ds);
		return "welcome";
	}

}
