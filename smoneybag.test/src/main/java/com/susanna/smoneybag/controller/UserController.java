package com.susanna.smoneybag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.susanna.smoneybag.service.UserService;

@Controller
@RequestMapping("/index")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/{id}")
	public String index(Model model,@PathVariable("id") Long id) {
		model.addAttribute("username", "Susanna");
		model.addAttribute("info", userService.fetchById(id));
		return "index";
	}
}
