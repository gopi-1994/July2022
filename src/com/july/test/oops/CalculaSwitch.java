package com.july.test.oops;

import java.util.Scanner;

public class CalculaSwitch {
	public static void main(String[] args) {
		
		operator op = new operator();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number.");
		int x = s.nextInt();
		System.out.println("Enter 2nd number.");
		int y = s.nextInt();

		System.out.println("Please enter + for addition");
		System.out.println("Please enter - for Subtraction...");
		System.out.println("Please enter * for Multiplication...");
		System.out.println("Please enter / for Division...");
		String oper = s.next();

		switch (oper) {
		case "+":
			System.out.println("Addition is..." + op.add(x, y));
			break;
		case "-":
			System.out.println("Subtraction is..." + op.sub(x, y));
			break;
		case "*":
			System.out.println("Multiplication is..." + op.multi(x, y));
			break;
		case "/":
			System.out.println("Division is..." + op.div(x, y));
			break;
		default:
			break;
		}
	}
}

class operator {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public int multi(int i, int j) {
		return i * j;
	}

	public int div(int i, int j) {
		return i / j;
	}
}
