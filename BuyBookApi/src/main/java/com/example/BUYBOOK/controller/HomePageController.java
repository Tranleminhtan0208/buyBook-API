package com.example.BUYBOOK.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.BUYBOOK.Entity.bookEntity;
import com.example.BUYBOOK.services.BookImpl;

@Controller
public class HomePageController {
	@Autowired
	private BookImpl bookImpl;
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		List<bookEntity> listBook = new ArrayList<>();
		listBook= bookImpl.findAll();
		model.addObject("listBook", listBook);
		return model;
	}
}
