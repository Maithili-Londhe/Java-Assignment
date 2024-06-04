package com.JavaAssignment;
import java.util.*;
/*Write a Java program that takes a number as input 
 * and prints its multiplication table up to 10.*/
public class Program3 {

	public static void main(String[] args) {
		int num,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
         num=sc.nextInt();
         
         for(int i=1;i<=10;i++) {
        	 //4*1
        	 count=num*i;
        		System.out.println(num+" x "+i+"= "+count);
         }
	}

}
