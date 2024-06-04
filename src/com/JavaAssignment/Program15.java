package com.JavaAssignment;
import java.util.*;
//Write a Java program to Find Quotient and Remainder for a given number.
public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

    
        int quotient = dividend / divisor;//10/5=2
        int remainder = dividend % divisor;//10%5=0

      
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

	}

}
