package com.july.test;

public class SumAverageFRunningInt {
public static void main(String[] args) {
	int sum = 0;
	final int lower = 1;
	final int upper = 100;
	double averg;
	
	for (int i = lower; i <=upper; i++) {
sum+=i;		
	}
	System.out.println("Sum is : "+sum);
	averg = (double)sum/upper;
	System.out.println("Average is : "+averg);
}
}
