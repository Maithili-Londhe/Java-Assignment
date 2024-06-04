package com.JavaAssignment;

import java.util.Scanner;

/*Write a Java program that takes three numbers as input to calculate and
 *  print the average of the numbers.*/
public class Program5 {

	public static void main(String[] args) {
		int a ,b,c, sum;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of First Number: ");
		a=sc.nextInt();
		System.out.println("Enter value of Second Number: ");
		b=sc.nextInt();
		System.out.println("Enter value of Third Number: ");
		c=sc.nextInt();
		
		//calculate sum and avg 
		sum=a+b+c;
		avg=(float)((a+b+c)/2);
		System.out.println("Average :"+avg);
	}

}
