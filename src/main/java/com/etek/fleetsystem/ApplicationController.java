package com.etek.fleetsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String goHome() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginAuth() {

		return "login";
	}

	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/accessDenied")
	public String fail(){
		return "accessDenied";
	}

}
