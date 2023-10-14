package com.example.BUYBOOK.services;

import com.example.BUYBOOK.DTO.Book;
import com.example.BUYBOOK.Entity.bookEntity;
import com.example.BUYBOOK.respositories.BookRepositories;
import com.example.BUYBOOK.respositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookDetailService {
    @Autowired
    BookRepositories bookRepositories;
    public List<bookEntity> loadBookDetail(){
        List<bookEntity> listPro = new ArrayList<>();
        listPro = bookRepositories.findByProductName("Ngay xua");
        return listPro;
    }
}
