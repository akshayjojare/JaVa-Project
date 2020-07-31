package com.app.studentbean;

public class Admin { 
	
	private String adminUserName;
	private String adminpassword;
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [adminUserName=" + adminUserName + ", adminpassword=" + adminpassword + "]";
	}
	

}
