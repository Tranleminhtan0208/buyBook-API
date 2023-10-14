package com.example.BUYBOOK.respositories;

import com.example.BUYBOOK.Entity.Users;
import com.example.BUYBOOK.Entity.bookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepositories extends JpaRepository<bookEntity, Long> {
    @Override
    List<bookEntity> findAll();
    List<bookEntity> findproductName(String productName);

    @Override
    <S extends bookEntity> S save(S entity);
}
