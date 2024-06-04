package com.JavaAssignment;
import java.util.*;
public class Ass2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		
		num1=num1*num2;//2*3=6
		num2=num1/num2;//6/3=2
		num1=num1/num2;//6/2=3
		
		System.out.println("After Swapping:"+"\nFirst Number :"+num1+"\nSecond Number :"+num2);
	}

}
