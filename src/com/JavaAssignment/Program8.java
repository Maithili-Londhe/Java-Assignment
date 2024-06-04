package com.JavaAssignment;

import java.util.Scanner;

//Write a Java program to swap two variables.
public class Program8 {

	public static void main(String[] args) {
		int temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
	    temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping : \nfirst number: "+a+"\nsecond number: "+b);

	}

}
