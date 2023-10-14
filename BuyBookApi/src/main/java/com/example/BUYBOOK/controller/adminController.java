package com.example.BUYBOOK.controller;

import com.example.BUYBOOK.Entity.bookEntity;
import com.example.BUYBOOK.services.BookImpl;
import com.example.BUYBOOK.services.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class adminController {
    @Autowired
    public BookImpl book;

    @GetMapping("/showAddProduct")
    public String showaddProduct(Model model){
        bookEntity pd = new bookEntity();
        String kq = null;
        model.addAttribute("productInput",pd);
        model.addAttribute("ketqua",kq);
        return "admin/addProduct";
    }
    @PostMapping("/addProduct")
    public String addProductAdmin(Model model, @ModelAttribute("productInput") bookEntity bookInput){
        if(book.save(bookInput)){
            model.addAttribute("ketqua","pass");
        } else{
            model.addAttribute("ketqua","fail");
        }
        return "admin/addProduct";
    }
}
