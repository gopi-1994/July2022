package com.july.test;

import java.util.Scanner;

public class Quotient_Reminder {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = s.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = s.nextInt();
		double divident =(double) n1/n2;
		System.out.println("quotient of two numbers is : "+divident);
		double reminder = n1%n2;
		System.out.println("reminder of two numbers is : "+reminder);
//		typecast
		byte d = 10;
		int i =d;
		byte e = (byte) i;
		System.out.println(e);
	}
	
}
