package com.july.test;

import java.util.Scanner;

class Odd_or_Even {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int n1 = s.nextInt();
	if (n1%2==0) {
		System.out.println("It is an EVEN number");
		
	} else {
		System.out.println("It is an ODD number");
	}
}
}
