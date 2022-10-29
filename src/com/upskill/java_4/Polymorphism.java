package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car(2, 4, "Red");
		WeeklyIncomeVoid();
	}
	
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	//Static Void Method
	public static void WeeklyIncomeVoid(){
		int bonus = 1000;
		int calculateWeeklyIncome = hourlyIncome *40 + 1000 +bonus;
		System.out.println("My Weekly Income ::: " + calculateWeeklyIncome);
	}
	
	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Audi ! ");
	}
	
	public static void car(int door){
		System.out.println("My car is Audi, it has door : " + door);
	}
	
	public static void car(int door, int seat){
		System.out.println("My car is Audi, it has door : " + door + " , it has Seat : "+seat);
	}
	
	public static void car(String color){
		System.out.println("My car is Audi, it has color : " + color);
	}
	
	public static void car(int door, int seat, String color){
		System.out.println("My car is Audi, it has door : " + door + " , it has Seat : "+seat + " , it has color : " + color);
	}

}