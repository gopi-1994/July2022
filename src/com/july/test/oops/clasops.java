package com.july.test.oops;

import java.util.Scanner;

public class clasops {
	
	public static void main(String[] args) {
		
		
		ATM me =new ATM();
		me.balance();
		me.withdrawmoney(1222);
		me.balance();
	}
}
	class ATM{
		int money = 10000;
		public int withdrawmoney(int amount) {
			System.out.println("Please enter amount to withdraw.....");
			Scanner witdrw = new Scanner(System.in);
			amount = witdrw.nextInt();
			money = money- amount;
			System.out.println("MOney withdrawn..."+amount);
			return amount;
	}
	 public void balance() {
		System.out.println("Your availble balance is..."+money);
		
	 }
	}	

