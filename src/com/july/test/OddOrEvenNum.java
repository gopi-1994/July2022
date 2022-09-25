package com.july.test;

import java.util.Scanner;

public class OddOrEvenNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		if (num%2==0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number");
		}
	System.out.println("bye!");	
	}
	
}
