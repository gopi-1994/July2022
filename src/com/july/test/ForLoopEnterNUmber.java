package com.july.test;

import java.util.Scanner;

public class ForLoopEnterNUmber {
	public static void main(String[] args) {
		int num, count ,sum = 0 ;
		System.out.println("Enter a number");
		try (Scanner s = new Scanner(System.in)) {
			num = s.nextInt();
		}
		 for (count = 0;  count< num; count++) {
			sum+=num;
			System.out.println("\n"+sum);	
		}
//		System.out.println(sum+"\n");
	}
	
}
