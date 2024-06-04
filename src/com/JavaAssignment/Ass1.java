package com.JavaAssignment;
import  java.util.*;
public class Ass1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("Enter third number:");
        int num3=sc.nextInt();
        System.out.println("Enter forth number:");
        int num4=sc.nextInt();
        
        //int temp1=num1<num2?num1:num2;
       // int temp2=num3<num4?num3:num4;
        int temp=(num1<num2?num1:num2)<(num3<num4?num3:num4)?num1<num2?num1:num2:num3<num4?num3:num4;
        
        
        System.out.println("Smallest number is:"+temp);
        
	}

}
