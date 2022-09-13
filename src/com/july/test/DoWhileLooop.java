package com.july.test;

import java.util.Scanner;

public class DoWhileLooop {
	
	public static void main(String[] args) {
		
		int num,sum = 0;
		do {System.out.println("Enter a number");
		
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
			sum+=num;
		} while (num!=0);
		System.out.println(sum);
		
		
	}
	
}
