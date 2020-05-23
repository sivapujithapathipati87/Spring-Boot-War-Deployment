/**
 * 
 */
package com.star.sud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sudarshan
 *
 */
@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String getLandingPage() {
		return "home";
	}

}
