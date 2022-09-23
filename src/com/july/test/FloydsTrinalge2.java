package com.july.test;

public class FloydsTrinalge2 {
	public static void main(String[] args) {
		{
			int i = 1;
			while (i < 10) {
				int j = 0;
				while (j < i) {
					System.out.print("*\t");
					j++;
				}
				System.out.println();
				i++;
			}
		}
		{
			int i=10;
			while(i>0) {
				int j = 0;
				while(j<i) {
					System.out.print("*\t");
					j++;
				}
				System.out.println();
				i--;
			}
		}
		
	}
}
