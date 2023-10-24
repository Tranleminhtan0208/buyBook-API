package com.example.BUYBOOK.services;

import com.example.BUYBOOK.Entity.bookEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface bookService {
    public List<bookEntity> getProductName();
    public List<bookEntity> findAll();
    public boolean save( bookEntity be);
}
