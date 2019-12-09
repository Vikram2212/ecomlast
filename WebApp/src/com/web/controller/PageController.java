package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
		@RequestMapping("/welcome")
		public ModelAndView helloWorld() throws Exception {
	 
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>Welcome <br> This is Vikram</h3></div><br><br>";
			return new ModelAndView("welcome", "message", message);
		}

}
