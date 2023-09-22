package com.example.BUYBOOK.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BUYBOOK.users.users;

@Service
public interface usersSevices {
	public List<users> getAllUser();
	public users getUserIdById (int Id);
}
