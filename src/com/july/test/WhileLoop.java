package com.july.test;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		
		int num,i=0,sum = 0 ;
		System.out.println("Enter a number");
		try (Scanner s = new Scanner(System.in)) {
			num = s.nextInt();
		}
		 while (i <=5) {
			 sum+=num;
			 System.out.println("\n"+sum);	
			 i++;
		}
			
			
		}
//		System.out.println(sum+"\n");
	}
	

