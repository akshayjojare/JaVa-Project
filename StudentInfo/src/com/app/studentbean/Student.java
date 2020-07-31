package com.app.studentbean;
public class Student {
	
	private int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	private String First_Name;
	private String Middle_Name;
	private String last_Name;
	private String Email;
	private String Mob_Number;
	private  String Stream;
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getMiddle_Name() {
		return Middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMob_Number() {
		return Mob_Number;
	}
	public void setMob_Number(String mob_Number2) {
		Mob_Number = mob_Number2;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", First_Name=" + First_Name + ", Middle_Name=" + Middle_Name + ", last_Name="
				+ last_Name + ", Email=" + Email + ", Mob_Number=" + Mob_Number + ", Stream=" + Stream + "]";
	}
	
	
	

}

