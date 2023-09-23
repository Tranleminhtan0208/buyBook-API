package com.example.BUYBOOK.services;

import java.util.List;

import com.example.BUYBOOK.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BUYBOOK.respositories.UserRepositories;

@Service
public class UserImpl implements usersSevices {

	@Autowired UserRepositories userrepositories;

	@Override
	public List<Users> getUsers() {
		return null;
	}

//	@Override
//	public Users getUserIdById(int Id) {
//		return userrepositories.getById(Id);
//	}
	@Override
	public List<Users> findAll(){
		return userrepositories.findAll();
	}

}
