package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method

	private String name = "Emad";					//Write & Read
	private int ssn = 451236457;					//Write only
	private String username = "Emad123";			//Read only
	
	//Setter Method - name
	public void setName(String value){				//Set the data - Write
		name = value;
	}
	
	//Getter Mathod - ssn
	public int getSSN(){
		return ssn;
	
	}
	
	//Getter Method - name
	public String getName(){						//Get the date - Read
		return name;
	}
	
	//Setter Method - ssn
	public void setSSN(int value){					//Set the data - Write
		ssn = value;
	}
	
	//Getter Method - username
	public String getUserName(){					//Get the date - Read
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Raihan");
		System.out.println(obj.getName());
		obj.setSSN(65849756);
		System.out.println(obj.getUserName());
		System.out.println(obj.getSSN());
		
		
		
		
	}
}


