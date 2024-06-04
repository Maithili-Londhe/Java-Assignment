package com.JavaAssignment;

import java.util.Scanner;

//Write a Java program to find the number of days in a month.
public class Program12 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in) ;
		    System.out.println("Enter the Month:");
		    int month=sc.nextInt();
		    
		    int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> -1; 
		    };
		    System.out.println("Number of days in the month: " + daysInMonth);
	}

}
