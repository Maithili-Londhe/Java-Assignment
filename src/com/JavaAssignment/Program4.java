package com.JavaAssignment;
import java.util.*;
//Write a Java program to print the area and perimeter of a circle.
public class Program4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius= sc.nextDouble();
        
        double area = Math.PI*radius*radius;
        double perimeter=2*Math.PI*radius;
        
        System.out.println("Area ="+area+"\nPerimeter="+perimeter);
        
       
	}

}
