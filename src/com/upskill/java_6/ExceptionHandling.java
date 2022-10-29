package com.upskill.java_6;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
		int x = 10;
		int y = 0;
		int result = x / y;
		System.out.println("result : " + result);
		} catch (ArithmeticException e){
		System.out.println("Exception : " + e);
		
		
		}catch (Exception e1){
		System.out.println("Exception : " + e1);
		
	
	}
		finally {
			System.out.println("Last line of the program");
		}
}
}