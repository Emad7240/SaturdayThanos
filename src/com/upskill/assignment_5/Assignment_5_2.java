package com.upskill.assignment_5;

public class Assignment_5_2 {


 /*
  	Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.	
For numbers1 which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.
*/
	
public String fizzBuzz(Integer i) {
String result = "";
if (i % 3 == 0) {
    result += "Fizz";
}
if (i % 5 == 0) {
    result += "Buzz";
}
if (result.equals("")) {
    result = i.toString();
}
return result;
}
	
}
