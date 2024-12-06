package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.MyUser;
import com.nit.repository.MyUserRepository;

@Controller
public class RegistrationController {

	@Autowired
	private MyUserRepository myUserRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/signup")
	public String signup(MyUser myUser, Model model) {
		model.addAttribute(myUser);
		return "registration";
	}

	@GetMapping("/users")
	public String signup(Model model) {
		model.addAttribute("users",myUserRepository.findAll());
		return "users";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute MyUser myUser) {	
		myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
		myUserRepository.save(myUser);
		return "success";
	}
}
