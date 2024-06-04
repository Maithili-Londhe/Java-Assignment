package com.JavaAssignment;
import java.util.*;
//Write a Java program that reads a number in inches and converts it to meters.
public class Program9 {

	public static void main(String[] args) {
		//1 inch=2.54cm/100=meter ,
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Inches:");
       double inches=sc.nextDouble();
       
       double meter=inches*0.0254;
       System.out.println(inches+" Inches is equal to "+meter+" Meters");
	}

}
