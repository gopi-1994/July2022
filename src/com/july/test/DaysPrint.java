package com.july.test;

import java.util.Scanner;

public class DaysPrint {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);;
	System.out.println("Enter one number between 0 to 6");
	int n = s.nextInt();
	switch (n) {
	case 0:
		System.out.println("Today is Sunday");
		break;
	case 1:
		System.out.println("Today is Monday");
		break;
	case 2:
		System.out.println("Today is Tuesday");
		break;
	case 3:
		System.out.println("Today is Wednesday");
		break;
	case 4:
		System.out.println("Today is Thursday");
		break;
	case 5:
		System.out.println("Today is Friday");
		break;
	case 6:
		System.out.println("Today is Saturday");
		break;

	default:
		System.out.println("Please Enter number between 0 to 6");
		break;
	}
	
}
}
