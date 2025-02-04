package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World My example by mkyong.........");
		System.out.println("default");
		return "hello";

	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello by Jenkins.....!!!");
		model.addObject("msg", name);

		return model;

	}
	
	@RequestMapping(value = "/{save}", method = RequestMethod.GET)
	public ModelAndView save(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello by Jenkins.....!!!");
		model.addObject("msg", name);

		return model;

	}

}
