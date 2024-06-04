package com.JavaAssignment;

import java.util.Scanner;

/*Write a Java program to print the area and perimeter of a rectangle*/
public class Program6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length:");
        double length= sc.nextDouble();
        
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter the width:");
        double width= sc.nextDouble();
        
        double area = length*width;
        double perimeter=2*(length+width);
        
        System.out.println("Area of Rectangle is ="+area+"\nPerimeter of Rectangle is="+perimeter);

	}

}
