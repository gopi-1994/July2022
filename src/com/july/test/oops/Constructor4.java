package com.july.test.oops;

public class Constructor4 {
	public static void main(String[] args) {
		BreakFast obj = new BreakFast();
obj.getBreakfast();
	}
}

class BreakFast {
	String sugar;

	public BreakFast() {
//		sugar = "";
		sugar = "sugar is added";
	}

	public void getBreakfast() {
		if (sugar != null) {
			System.out.println("Food is added with sugar");
		} else {
			System.out.println("Sugar is not added in the food");
		}

	}

}