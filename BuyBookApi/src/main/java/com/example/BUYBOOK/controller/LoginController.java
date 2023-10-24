package com.example.BUYBOOK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.BUYBOOK.DTO.LoginInfo;

@Controller
public class LoginController {
	@GetMapping("/signin")
	public ModelAndView signin() {
		ModelAndView model = new ModelAndView("signin");
        model.addObject("loginInfo", new LoginInfo(null, null));
		return model;
	}
}
