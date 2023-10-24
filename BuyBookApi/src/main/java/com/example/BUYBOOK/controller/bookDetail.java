package com.example.BUYBOOK.controller;

import com.example.BUYBOOK.DTO.Book;
import com.example.BUYBOOK.Entity.bookEntity;
import com.example.BUYBOOK.services.BookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class bookDetail {
	@Autowired
	private BookDetailService BS;

	@GetMapping("/book-detail/{id}")
	public ModelAndView showBook(@PathVariable("id") Long productId) {
		ModelAndView bookDetail = new ModelAndView("book-detail");
		bookEntity book = BS.getBookById(productId);
		bookDetail.addObject("book", book);
		return bookDetail;
	}

	@GetMapping("/book-detail")
	public String showBookDetail(@ModelAttribute("Book") Book book, Model model) {
		List<bookEntity> list = new ArrayList<>();
		list = BS.loadBookDetail();

		model.addAttribute("list", list);
		return "book-detail";
	}

}
