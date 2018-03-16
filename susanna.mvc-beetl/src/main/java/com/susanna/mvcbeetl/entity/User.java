package com.susanna.mvcbeetl.entity;

public class User {
	Long id;
	String username;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + "]";
	}
	
	
	
	
}
