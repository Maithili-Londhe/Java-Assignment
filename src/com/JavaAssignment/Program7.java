package com.JavaAssignment;
import java.util.*;
//Write a Java program to print the area of a triangle. 
public class Program7 {

	public static void main(String[] args) {
		//area=1/2*b*h
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the triangle:");
		double base=sc.nextDouble();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the height of the triangle:");
		double height = sc1.nextDouble();
		
		double area=0.5*base*height;
      System.out.println("Area of a triangle is:"+area); 
	}

}
