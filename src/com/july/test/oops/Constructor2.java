package com.july.test.oops;

public class Constructor2 {
	public static void main(String[] args) {
		B obj = new B(30);
		obj.met();
	}
	

}

class B{
	int age = 10; //global variable
	public B(int age) {
		int age1 = 90; // local variable
		this.age=age1;// this refers to  local variable
	}
	public void met() {
		System.out.println(age);
		met2(new B(60));
		met2(this);
	}
	public void met2(B obj) {

	}
	
}