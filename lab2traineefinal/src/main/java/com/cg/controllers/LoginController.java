package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entities.Login;

@Controller
@RequestMapping("/")

public class LoginController {
	
	@GetMapping
	public String home(Model model) {
		model.addAttribute("msg","Welcome to Spring mvc");
		return "login";
	}
	
	@PostMapping
	public String login(Model model, @ModelAttribute("login") Login login) {
		
		if(login.getUsername().equals("admin") && login.getPassword().equals("admin")) {
			return "operation";
		}
		else
			return "login";
	}
}
