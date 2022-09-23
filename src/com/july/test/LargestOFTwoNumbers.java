package com.july.test;

import java.util.Scanner;

class LargestOFTwoNumbers {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter 3 numbers");
	int n1 = s.nextInt();
	int n2 = s.nextInt();
	int n3 = s.nextInt();
	if (n1>n2&&n1>n3) {
		System.out.println("n1 is large number");
		
	} else if (n2>n1&&n2>n3) {
		System.out.println("n2 is large number");
	}else {
		System.out.println("n3 is large number");
	}
}
}
