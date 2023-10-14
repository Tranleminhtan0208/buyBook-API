package com.example.BUYBOOK.services;

import com.example.BUYBOOK.Entity.bookEntity;
import com.example.BUYBOOK.respositories.BookRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookImpl implements bookService {

    @Autowired
    BookRepositories bookRepositories;

    @Override
    public List<bookEntity> getProductName() {
        return null;
    }

    //	@Override
//	public Users getUserIdById(int Id) {
//		return userrepositories.getById(Id);
//	}
    @Override
    public List<bookEntity> findAll(){
        return bookRepositories.findAll();
    }
}
