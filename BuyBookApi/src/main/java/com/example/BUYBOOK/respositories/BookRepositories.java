package com.example.BUYBOOK.respositories;

import com.example.BUYBOOK.Entity.bookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepositories extends JpaRepository<bookEntity, Long> {
    @Override
    List<bookEntity> findAll();
    List<bookEntity> findByProductName(String productName);
	List<bookEntity> findByProductId(Long productId);

    @Override
    <S extends bookEntity> S save(S entity);
}
