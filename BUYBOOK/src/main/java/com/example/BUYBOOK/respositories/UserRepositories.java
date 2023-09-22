package com.example.BUYBOOK.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BUYBOOK.users.users;

public interface UserRepositories extends JpaRepository<users, Integer> {

}
