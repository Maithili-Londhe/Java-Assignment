package com.JavaAssignment;

import java.util.Scanner;

//Write a Java program that takes a year from the user and prints whether it is a leap year or not.
public class Program13 {
	
	public static boolean isLeapYear(int year) {
	    if (year % 4 == 0) {
	        if (year % 100 == 0) {
	            return year % 400 == 0;
	        } else {
	            return true;
	        }
	    } else {
	        return false;
	    }
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Year:");
    int year=sc.nextInt();
    boolean isLeapYear = isLeapYear(year);
    if (isLeapYear) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }
	}

}
