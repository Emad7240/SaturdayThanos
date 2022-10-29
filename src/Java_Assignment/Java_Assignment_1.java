/* Problem1. Write a for loop that prints 50 through 1 separated by spaces in the
same line.*/
package com.talentech.assignment2;

public class Problem1 {
	
public static void main(String[] args) {

int a;
for (a=1;a&lt;=50;a++){
System.out.print(a+&quot; &quot;);}
}
}
/* Problem2. A school conducts a 100 mark exam for its student and grades them as
follows:
Grade:
Grade A: Marks&gt;=90
Grade B: Marks&gt;=80-89
Grade C: Marks&gt;=70-79
Grade D: Marks&gt;=60-69 AND FAIL THEM WHO HAS &lt;60
Write a java program to calculate the grade for a student in a method passing
parameter for grade
to display every grade type, using if..else statement. */
package com.talentech.assignment2;
public class Problem2 {
public static void main(String[] args) {
myMethod(50);
}
public static void myMethod(int Marks) {
if (Marks&gt;=90 &amp;&amp; Marks&lt;=100){
System.out.println(&quot;Grade A&quot;);}
else if (Marks&gt;=80 &amp;&amp; Marks&lt;=89){
System.out.println(&quot;Grade B&quot;);}
else if (Marks&gt;=70 &amp;&amp; Marks&lt;=79){
System.out.println(&quot;Grade C&quot;);}
else if (Marks&gt;=60 &amp;&amp; Marks&lt;=69){
System.out.println(&quot;Grade D&quot;);}
else if (Marks&lt;60){
System.out.println(&quot;Fail&quot;);}
else {
System.out.println(&quot;Invalid Marks&quot;);}

}
}

/* Problem3. Write two java functions which will return two different integer values,
write a program to compare those numbers and send message that one number is bigger
than other.
(hints: using if..else)*/
package com.talentech.assignment2;
public class Problem3 {
public static int a;
public static int b;
public static void main(String[] args) {
a = myFunction1();
b = myFunction2();
myMethod();
}
public static int myFunction1(){
return 55;
}
public static int myFunction2(){
return 65;
}
public static void myMethod(){
if (a&gt;b);{
System.out.println(&quot;1st Function is bigger then 2nd Function&quot;);}
if (a&lt;b);{
System.out.println(&quot;2nd Function is bigger then 1st Function&quot;);}

}
}

/* Problem4. Write a for loop upto 500 which will increase the value double every
time.*/
package com.talentech.assignment2;
public class Problem4 {
public static void main(String[] args) {
myMethod();
}
public static void myMethod(){

for (int i = 1; i &lt;= 500; i = i * 2) {
System.out.println(&quot;Double values:&quot; + i);
}

}
}

/* Problem5. Write a program in Java to display the multiplication table of
(eight)8.*/
package com.talentech.assignment2;
public class Problem5 {
public static void main(String[] args) {
myMethod();
}
public static void myMethod() {
for (int row = 1; row &lt;= 8; row++) {
for (int col = 1; col &lt;= 8; col++) {
int MultiplicationTable = row * col;
System.out.print(MultiplicationTable + &quot; &quot;);
}
System.out.println(&quot;&quot;);
}
}
}

/* Problem6. Write a java program to find the prime number from 1 to 100 and print
them.*/
package com.talentech.assignment2;
public class Problem6 {
public static void main(String[] args) {
myMethod();
}
public static void myMethod(){
int upperbound = 100;
for (int number = 2; number &lt;= upperbound; ++number) {
int maxFactor = (int) Math.sqrt(number);
boolean isPrime = true;
int factor = 2;
while (isPrime &amp;&amp; factor &lt;= maxFactor) {
if (number % factor == 0) {
isPrime = false;
}
++factor;
}
if (isPrime)
System.out.println(number + &quot; is a prime&quot;);

}
}

/* Problem7. You are given two integer number (a=25, b=30),
write a program to swap them and display result on the screen. */
package com.talentech.assignment2;
public class Problem7 {
public static void main(String[] args) {
myMethod();
}
public static void myMethod(){
int a = 25;
int b = 30;
int temp;
temp = a;
a = b;
b = temp;
System.out.println(&quot;Swap value a:&quot; + a);
System.out.println(&quot;Swap value b:&quot; + b);
}
}

/* Problem8. Write Java Program to display Factorial of Number 7. */
package com.talentech.assignment2;
public class Problem8 {
public static void main(String[] args) {
myMethod();
}
public static void myMethod(){
int n = 7;
int result = 1;
for (int i = 1; i &lt;= n; i++) {
result = result * i;
}
System.out.println(&quot;The factorial of 7 is &quot; + result);
}
}

/* Problem9. Write a program to swap two string variables (Talen, Tech) and display
result on the screen. */
package com.talentech.assignment2;
public class Problem9 {
public static void main(String[] args) {
myMethod();
}
public static void myMethod(){
String a = &quot;Talen&quot;;
String b = &quot;Tech&quot;;
String swap = a;
a = b;
b = swap;
System.out.println(&quot;Swap value a: &quot;+a);
System.out.println(&quot;Swap Value b: &quot;+b);
}
}

/* Problem10. Write a Java program to convert temperature from Fahrenheit to Celsius
degree. */
package com.talentech.assignment2;
import java.util.Scanner;
public class Problem10 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println(&quot;Enter the Degree Fahrenheit: &quot;);
double a = s.nextInt();
s.close();
myMethod(a);
}
public static void myMethod(double a){
double fahrenheit = 0;
double celsius = (fahrenheit - 32) * 5.0 / 9.0;
System.out.println(&quot;The Equivalent of celsius is: &quot;);
System.out.println(celsius);
}
}
