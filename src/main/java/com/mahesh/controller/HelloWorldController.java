package com.mahesh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@RequestMapping("/greet")
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller /hello");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	/**
	 * 1
	 * This is for the @PathVariable example
	 */
	/*@RequestMapping("/welcome/{countryName}/{username}")
	public ModelAndView showName(
			@PathVariable("username") String username, 
			@PathVariable("countryName") String countryName) {
		System.out.println("in controller /welcome/{countryName}/{username} - var");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", "Name:" + username + " country: " + countryName );
		return mv;
	}*/
	
	/**
	 * 2
	 * @PathVariable
	 * Incase the number path varibale are more, Parameters can be replaced with Map
	 * but in order to use the Map, then we need to add <mvc:annotation-drive/> in the applicationContenxt xml
	 *  
	 */
	@RequestMapping("/welcome/{countryName}/{username}")
	public ModelAndView showName(
			@PathVariable Map<String, String> pathVars) {
		System.out.println("in controller /welcome/{countryName}/{username}  --- Map");
		String username = pathVars.get("username");
		String countryName = pathVars.get("countryName");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", "Name:" + username + " country: " + countryName );
		return mv;
	}
	
}