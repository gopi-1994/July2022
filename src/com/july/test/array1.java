package com.july.test;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		
				int[] ar = {10,20,30,40,50};
		int sum =0;
		for (int i : ar) {
			sum = sum + i;
		}
		System.out.println(sum);
//		sum of array entered
		Scanner s = new Scanner(System.in);
		int ar1[]=new int[5];
		int su = 0;
		System.out.println("enter the numbers");
		for (int i = 0; i < ar.length; i++) {
			ar1[i]=s.nextInt();
		}
		for (int j : ar1) {
			su = su +j;
		}
		System.out.println(su);
	}

}
