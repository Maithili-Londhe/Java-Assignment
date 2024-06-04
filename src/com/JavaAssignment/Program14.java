package com.JavaAssignment;
import java.util.*;
public class Program14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rateOfInterest = scanner.nextDouble();
        
        System.out.print("Enter the time duration (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rateOfInterest * time) / 100;

      
        System.out.println("Simple Interest: " + simpleInterest);

	}

}
