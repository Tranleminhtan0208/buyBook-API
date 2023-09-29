package com.example.BUYBOOK.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BUYBOOK.services.usersSevices;
import com.example.BUYBOOK.Entity.Users;

@RestController
public class userController {
	@Qualifier("userImpl")
	@Autowired
	public usersSevices sevices;
	@GetMapping("/listUser")
	public List<Users> getListUser() {
		List<Users> u = new ArrayList<>();
		u = sevices.findAll();
		return getListUser();
	}
}
