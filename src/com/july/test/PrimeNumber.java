package com.july.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = s.nextInt();
		boolean con = false;
		for (int i = 2; i <= n1 / 2; ++i) {
			if (n1 % i == 0) {

				con = true;
				break;
			}
		}
			if (!con) {
				System.out.println("This is a prime number");
			} else {
				System.out.println("this is not a prime number");
				
			}

		
	}
	}

