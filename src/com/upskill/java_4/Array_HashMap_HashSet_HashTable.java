package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_HashTable {
	
	public static void main(String[] args) {
		
		// Array store multipul data using index

		int age = 30;													//Variable
		int[] ageThanos = new int[]{30, 35, 27, 22, 40, 32};			//Array
		
		//Array index				[0] [1] [2] [3] [4] [5]

		System.out.println("Student Age : " + ageThanos[3]);
		System.out.println("Total Student : " + ageThanos.length);
		
		String[] nameThanos = new String[]{"Ava", "Rupa", "Saima", "Sami", "Fahim", "Farabi"};
		System.out.println("Student Name : " + nameThanos[3]);
		System.out.println("Total Student : " + nameThanos.length);
		
		//Multi-Dimensional Array
		int [][] ageThanos2D = {{30, 35, 27, 22, 40, 32},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
								{37, 26, 24, 35}};				//[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2D : " + ageThanos2D[0][4]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ava", 23);
		Student.put("Fahim", 35);
		Student.put("Pranto", 24);
		
		System.out.println("HashMap Student Age : " + Student.get("Fahim"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Sylhet");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " + Capital.get("USA"));	
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		System.out.println("Car : " + car);
	
	//HashTable store multipul data using key-value pair, but is synchronized (only one thread can be modified)
	
			Hashtable<String, String> Region = new Hashtable<String, String>();
			Region.put("BD", "Asia");
			Region.put("USA", "North America");
			System.out.println("Region : " + Region.get("BD"));
		}
}

