package com.rohan;

public class Login {
	String username;
	String password;
	
	public void userLogin(String username1,String password1) {
		if(username==username1 && password==password1) {
			System.out.println("LoggedIn Successfully");
		}else {
			System.out.println("Invalid Data"); 
		}
	}
}
