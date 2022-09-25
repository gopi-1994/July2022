package com.july.test;

import java.util.Scanner;

public class SwithchCase1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 or 2");
		int a = s.nextInt();

		switch (a) {
		case 1: {
			System.out.println("this si number 1");
			break;
		}
		case 2: {
			System.out.println("this is number 2");
			break;
		}
		default: {
			System.out.println("please enter 1 or 2");
		}

		}
	}
}
