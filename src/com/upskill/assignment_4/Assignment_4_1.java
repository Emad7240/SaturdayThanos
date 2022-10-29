package com.upskill.assignment_4;

public class Assignment_4_1 {

     /*
	Write a USER PROGRAM using encapsulation that contains the username, password, email, first and last names of a user of our application. Display the user information in console output.
	 */

	class Encapsulate {
	private String username = "Emad";
	private String password = "test";
	private String email = "Emaduddin@gmail.com";
	private String first_name = "Emad";
	private String last_name = "Uddin";

	void display() {
	System.out.println("Username: " + username);
	System.out.println("Password: " + password);
	System.out.println("Email: " + email);
	System.out.println("First name: " + first_name);
	System.out.println("Last name: " + last_name);
	}
	}
		
	public class assignment_4 {

	public static void main(String[] args) {
	Encapsulate e = new Encapsulate();
		e.display();
		}
	}



