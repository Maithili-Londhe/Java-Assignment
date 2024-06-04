package com.JavaAssignment;
import java.util.*;
/*Write a Java program that takes two values as input and displays the sum of two numbers*/
public class Program2 {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first number:");
	    a=sc.nextInt();
	    Scanner sc1=new Scanner(System.in);
	    System.out.println("Enter second number:");
	    b=sc1.nextInt();
	    
	   sum=a+b;
	   System.out.println("Sum of two numbers is: "+sum);
	    
	}

}
