package com.july.test;

public class Square_Count {
public static void main(String[] args) {
	int count = 0, sum = 0;
	final int lower = 1;
	final int upper = 100;
	
//	normal count
//	for (int i = lower; i <=upper; i++) {
//sum+=i;		
//count++;
//	}
	
//	square counts , print even numbers
	for (int i = lower; i <=upper; i++) {
		if (i%2==0) {
			continue;
		}
		sum+=i*i;		
		count++;
			}
	System.out.println("Sum is : "+sum);
//	averg = (double)sum/upper;
	System.out.println("Count  is : "+count);
}
}
