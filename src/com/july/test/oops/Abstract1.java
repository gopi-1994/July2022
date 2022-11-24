package com.july.test.oops;

public class Abstract1 {
public static void main(String[] args) {
	alpha obj = new alpha1();
	obj.met();
}
}

abstract class alpha {
	public void met() {
		System.out.println("ifgyiadgf");

	}
}

class alpha1 extends alpha{
	@Override
	public void met() {
		System.out.println("gbbboooooo");
		
	}
}