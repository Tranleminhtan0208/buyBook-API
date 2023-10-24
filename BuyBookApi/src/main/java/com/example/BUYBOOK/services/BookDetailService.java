package com.example.BUYBOOK.services;

import com.example.BUYBOOK.Entity.bookEntity;
import com.example.BUYBOOK.respositories.BookRepositories;
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

	public bookEntity getBookById(Long id){
		List<bookEntity> list = new ArrayList<>();
		list = bookRepositories.findByProductId(id);
		bookEntity book= new bookEntity();
		book =list.get(0);
		return book;
	}
}
