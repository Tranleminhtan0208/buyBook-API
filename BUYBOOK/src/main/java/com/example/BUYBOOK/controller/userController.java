package com.example.BUYBOOK.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BUYBOOK.services.usersSevices;
import com.example.BUYBOOK.users.users;

@RestController
public class userController {
	@Autowired usersSevices sevices;
	@GetMapping("/listUser")
	public List<users> getListUser() {
		return sevices.getAllUser();
		
	}
}
