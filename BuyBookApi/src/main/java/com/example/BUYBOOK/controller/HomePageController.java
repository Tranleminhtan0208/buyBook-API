package com.example.BUYBOOK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.BUYBOOK.DTO.LoginInfo;
import com.example.BUYBOOK.DTO.SignUpDTO;

@Controller
public class HomePageController {
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
        model.addObject("loginInfo", new LoginInfo(null, null));
		return model;
	}
    @GetMapping("/signup")
    public ModelAndView signup(){
        ModelAndView model = new ModelAndView("signup");
        model.addObject("signUpDTO", new SignUpDTO(null, null, null, null, null));
        return model;
    }
}
