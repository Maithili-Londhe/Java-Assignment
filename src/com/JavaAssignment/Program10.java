package com.JavaAssignment;
import java.util.*;
//Write a Java program to convert minutes into years and days.
public class Program10 {

	public static void main(String[] args) {
		    final int Minutes_In_Hour = 60;
	        final int Hours_In_Day = 24;
	        final int Days_In_Year = 365;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of Minutes:");
           long minutes=sc.nextLong();
           
           long totalHours = minutes /Minutes_In_Hour;  //hr=1440/60=24hr
           System.out.println("totalHours"+totalHours);
           long totalDays = totalHours / Hours_In_Day; //day=24hr/24=1day
           System.out.println("totalDays"+totalDays);
           long years = totalDays / Days_In_Year;
           long days = totalDays % Days_In_Year;
           System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
	}

}
