package com.july.test;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length");
		double n1 = s.nextDouble();
		System.out.println("Enter width or height");
		double n2 = s.nextDouble();
		double n3 = n1*n2;
		System.out.println("\nArea of rectangle is "+n3);
		System.out.println("\nArea of square is "+n1*n1);
		System.out.println("\nArea of triangle is "+(n1*n2)/2);
		System.out.println("\nArea of circle is "+(Math.PI*(n1*n1)));
	}
}
