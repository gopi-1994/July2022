package com.july.test;

import java.util.Scanner;

public class SwapingTwoNUmbers {
	public static void main(String[] args) {
		
		
		int a,b;
		System.out.println("Enter 1st number");
		Scanner s = new Scanner(System.in);
			a = s.nextInt();
		System.out.println("Enter 2nd number");
		b=s.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println(a);
		 System.out.println(b);
			
		}
//		System.out.println(sum+"\n");
	}
	

