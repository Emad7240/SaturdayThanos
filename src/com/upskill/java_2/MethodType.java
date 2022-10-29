package com.upskill.java_2;

public class MethodType {
	
	/* 	Types of Methods
	 
		1.Void Method
		2.Static Method
		3.Return Type Method   */
	
	public static int hourlyIncome = 100;

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		System.out.println("My Monthly Income ::: " + obj.monthlyIncomeReturn());
		WeeklyIncomeVoid();

	}
	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome *2000;
		System.out.println("My Annual Income ::: " + calculateAnnualIncome);
	}
	
	//Return Type Method 
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 190;
		return calculateMonthlyIncome;
	}
	
	//Static Void Method
	public static void WeeklyIncomeVoid(){
		int calculateWeeklyIncome = hourlyIncome *50;
		System.out.println("My Weekly Income ::: " + calculateWeeklyIncome);
	}
}