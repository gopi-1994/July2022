package com.july.test;

import java.util.Scanner;

public class IncomeTaxCalculator {
	static final double taxRateUpto40K = 0.1;
	static final double taxRateUpto60K = 0.2;
	static final double taxRateAbove60K = 0.3;
	public static double taxableAmount;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Income");
		taxableAmount = s.nextDouble();
		try {
			taxCalculator(taxableAmount);
		} catch (Exception e) {
			TODO: System.out.println("Enter the Amount Properly");
		}
	}

	static void taxCalculator(double taxableAmount) {

		if (taxableAmount <= 20000) {
			System.out.println("Income Tax amount is : 0.00");
		} else if (taxableAmount <= 40000) {
			System.out.printf("Income Tax amount is : %.2f" , (taxableAmount * taxRateUpto40K));
		} else if (taxableAmount <= 60000) {
			System.out.printf("Income Tax amount is : %.2f" , taxableAmount * taxRateUpto60K);

		} else if (taxableAmount > 60000) {
			System.out.printf("Income Tax amount is : %.2f" , taxableAmount * taxRateAbove60K);

		}

	}

}
