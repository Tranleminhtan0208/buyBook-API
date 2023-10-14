package com.example.BUYBOOK.services;

import com.example.BUYBOOK.Entity.bookEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface bookService {
    public List<bookEntity> getProductName();
    //	public Users getUserIdById (int Id);
    public List<bookEntity> findAll();
}
