package com.example.BUYBOOK.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BUYBOOK.Entity.Users;

@Service
public interface usersSevices {
	public List<Users> getUsers();
//	public Users getUserIdById (int Id);
	public List<Users> findAll();

}
