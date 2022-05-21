package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController 
{   //jsp page name
   @RequestMapping("/hello")
   public ModelAndView helloWorld()
   {
	   String message="Hello World,Spring 3.0!";
	   //                        view     model(key&value)
	   return new ModelAndView("hello", "message", message);
	   
	   
   }
}

