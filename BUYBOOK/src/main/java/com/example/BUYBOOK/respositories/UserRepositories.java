package com.example.BUYBOOK.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BUYBOOK.Entity.Users;

import java.util.List;

public interface UserRepositories extends JpaRepository<Users, Long> {
    @Override
    List<Users> findAll();


}
