package com.example.BUYBOOK.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BUYBOOK.respositories.UserRepositories;
import com.example.BUYBOOK.users.users;
@Service
public class UserImpl implements usersSevices {

	@Autowired UserRepositories userrepositories;
	@Override
	public List<users> getAllUser() {
		return userrepositories.findAll();
		
	}

	@Override
	public users getUserIdById(int Id) {
		return userrepositories.getById(Id);
	}

}
