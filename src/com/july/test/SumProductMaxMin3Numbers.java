package com.july.test;

import java.util.Scanner;

public class SumProductMaxMin3Numbers {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int e;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Five numbers");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		e = s.nextInt();
		sum(a, b, c, d, e);
		prod(a, b, c, d, e);
		maxx(a, b, c);
		minn(a, b, c);
	}

	public static void sum(int a, int b, int c, int d, int e) {
		System.out.println("Sum of three numbers is : " + (a + b + c + d + e));

	}

	public static void prod(int a, int b, int c, int d, int e) {
		System.out.println("Product of three numbers is : " + (a * b * c * d * e));
	}

	public static void maxx(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println(a + " is Maximum number");

		} else if (b > a && b > c) {
			System.out.println(b + " is Maximum number");

		} else {
			System.out.println(c + " is Maximum number");

		}

	}

	public static void minn(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println(a + " is Minimum number");

		} else if (b < a && b < c) {
			System.out.println(b + " is Minimum number");

		} else {
			System.out.println(c + " is Minimum number");

		}

	}

}
