package com.example.BUYBOOK.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "User") // Tên bảng mapping db
public class users {
	@Id
	@Column(name = "ID")
	private int Id;
	
	@Column(name = "Username")
	private String Username;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Role")
	private String Role;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
	
	
}
