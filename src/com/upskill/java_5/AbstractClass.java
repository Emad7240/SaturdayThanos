package com.upskill.java_5;

public abstract class AbstractClass {
	
	//Abstract class has both abstract method and regular method
	
	//Abstract Method
	
	public abstract void iDoor();
	
	public abstract void iSeat();
	
	public abstract void iWheel();
	
	public abstract void iRadio();
	
	//Non-abstract or Regular Method
	
	public void brand(){
		String brand = "Audi";
	}
	
	public void color(){
		String color = "Black";
	}
	
	public void engine(){
		int motor = 2;
	}

}
