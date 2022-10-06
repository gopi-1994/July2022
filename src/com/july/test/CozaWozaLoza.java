package com.july.test;

public class CozaWozaLoza {
public static void main(String[] args) {
	final int lower =1, upper = 100;
	
	for (int i = lower; i <=upper; i++) {
		if(i%3==0) {
			System.out.println("Coza");
			
		}
		if (i%5==0) {
			System.out.println("Loza");
		}
		
		if (i%7==0) {
			System.out.println("Moza");
		}
		if(!((i%3)==0)&&!((i%5)==0)&&!((i%7)==0)) {
			System.out.println(i);
			
		}
	}
	
}
}
