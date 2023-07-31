package com.example.epicode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.epicode.classes.User;
import com.example.epicode.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/home")
	public String getHome() {
		return ("index");
	}

	@GetMapping("/rubrica")
	public ModelAndView getRubrica() {
		List<User> listaUser = userService.getAllUser();
		ModelAndView model = new ModelAndView("rubrica");
		model.addObject("lista", listaUser);
		return model;
	}

}
