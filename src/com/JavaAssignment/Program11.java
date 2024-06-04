package com.JavaAssignment;
import java.util.*;
//Write a Java program that takes three numbers from the user and prints the greatest number.
public class Program11 {

	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in) ;
	    System.out.println("Enter first number:");
	    int a=sc.nextInt();
	    
	    Scanner sc1= new Scanner(System.in) ;
	    System.out.println("Enter second number:");
	    int b=sc.nextInt();
	    
	    Scanner sc2= new Scanner(System.in) ;
	    System.out.println("Enter third number:");
	    int c=sc.nextInt();
	    
	    int temp=a>b?a:b;
	    int largest=c>temp?c:temp;
	    System.out.println("The Largest number is:"+largest);
	}

}
