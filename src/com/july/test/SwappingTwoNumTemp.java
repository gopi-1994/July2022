package com.july.test;

import java.util.Scanner;

public class SwappingTwoNumTemp {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two number");
	int n1 = s.nextInt();
	int n2 = s.nextInt();
	System.out.println("before swapping..."+n1);
	System.out.println("before swapping..."+n2);
	
	int temp =n1;
	n1=n2;
	n2=temp;
	System.out.println("after swapping..."+n1);
	System.out.println("After swapping..."+n2);
}
}
