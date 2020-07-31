package com.app.studentbean;

public class User { 
	
	private String User_Name;
	private String password;
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User_pojo [User_Name=" + User_Name + ", password=" + password + "]";
	}
	

}
