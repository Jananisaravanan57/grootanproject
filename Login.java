package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")

public class Login {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long User_ID;
	
	@Column(name = "User_Name")
	private String User_Name;

	@Column(name = "Password")
	private String Password;

	

	public long getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(long user_ID) {
		User_ID = user_ID;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
	public Login() {

	}

	public Login(String user_Name, String password) {
		User_Name = user_Name;
		Password = password;
		
	}

}
