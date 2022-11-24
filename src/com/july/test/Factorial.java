package com.july.test;

public class Factorial {
public static void main(String[] args) {
// factorial program
	double prod = 1;
	int count = 0;
	
	int upper =200;
	 for (int i = 1; i <=upper; i++) {
		 prod*=(double)i;
		 System.out.print(prod+"\t");
	count++;	 
	}
//	 System.out.println(prod);
	 System.out.println("\ncount : "+count);
}
}
