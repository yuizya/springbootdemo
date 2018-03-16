package com.susanna.mvcbeetl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.susanna.mvcbeetl.entity.User;
import com.susanna.mvcbeetl.service.UserService;

@Controller
@RequestMapping("/test")
public class HelloworldController {
	@Autowired
	private UserService userService;
	@RequestMapping("/index.html")
	public String say(Model model) {
		model.addAttribute("name", "hello,world");
		return "/index.btl";
	}
	@RequestMapping("/all.json")
	public @ResponseBody List<User> allUser(){
		return userService.allUser();
	}
	@GetMapping(path="{userId}/get.html")
	public String getUser(@PathVariable Long userId,Model model) {
		User userById = userService.getUserById(userId);
		model.addAttribute("user", userById);
		return "/userInfo.btl";
	}
	@RequestMapping("/userdetail.html")
	public String foo(String id) {
		return "/userInfo.btl";
	}
}
