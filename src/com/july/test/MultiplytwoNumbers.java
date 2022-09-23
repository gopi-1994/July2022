package com.july.test;

import java.util.Scanner;

public class MultiplytwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = s.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = s.nextInt();
		int sum = n1*n2;
		System.out.println("multiplication of two numbers is : "+sum);
//		typecast
		byte d = 10;
		int i =d;
		byte e = (byte) i;
		System.out.println(e);
	}
	
}
