package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller class for screen display and text transfer
 */
@Controller
public class RequestProc1 {

	/**
	 * Function to display the screen initially
	 * @return "index" Return index.html
	 */
	@RequestMapping(value="/")
	public String index() {

		return "index1";
	}

	/**
	 * Function to change a string to a format for output
	 * @param name Name string
	 * @param tweet Tweet string
	 * @return mav ModelAndView containing the string
	 */
	@RequestMapping(value="/callResponse")
	public ModelAndView response(@RequestParam("name") String name,
								@RequestParam("tweet") String tweet) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index1");
		// Store the string in ModelAndView
		mav.addObject("helloResponse", "Hello. I am " + name + ".");
		mav.addObject("tweetResponse", tweet);

		return mav;
	}

}
