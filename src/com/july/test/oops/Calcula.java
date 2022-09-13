package com.july.test.oops;

import java.util.Scanner;

public class Calcula {
	public static void main(String[] args) {
	operator calci = new operator();// initiated in the same package 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 1st number.");	
	int x = s.nextInt();
	System.out.println("Enter 2nd number.");
	int y = s.nextInt();
	
	System.out.println("Addition..."+calci.add(x, y));
	System.out.println("Subtraction..."+calci.sub(x, y));
	System.out.println("Multiplication..."+calci.multi(x, y));
	System.out.println("Division..."+calci.div(x, y));
	
	}
}
	

