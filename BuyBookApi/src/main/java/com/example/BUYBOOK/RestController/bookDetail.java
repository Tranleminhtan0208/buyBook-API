package com.example.BUYBOOK.RestController;
import com.example.BUYBOOK.DTO.Book;
import com.example.BUYBOOK.DTO.LoginInfo;
import com.example.BUYBOOK.Entity.bookEntity;
import com.example.BUYBOOK.respositories.BookRepositories;
import com.example.BUYBOOK.services.BookDetailService;
import com.example.BUYBOOK.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
    public class bookDetail {
    @Autowired
    private BookDetailService BS;
        @GetMapping("/book-detail")
        public String showBookDetail(@ModelAttribute("Book") Book book, Model model) {
            List<bookEntity> list = new ArrayList<>();
            list = BS.loadBookDetail();

            model.addAttribute("list", book);
            return "book-detail";
        }
}
