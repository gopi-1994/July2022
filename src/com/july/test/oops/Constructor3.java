package com.july.test.oops;

public class Constructor3 {
public static void main(String[] args) {
	Sub obj = new Sub();
	obj.met();
	System.out.println(obj.a);// overriding don't apply for variable
}
}

class Super1{
	public Super1() {
	System.out.println("super con called.......");//Overriding don't apply for constructor
	}
	int a =1;
	public void met() {
		System.out.println("Super met i scalled......");

	}
}

class Sub extends Super1{
	public Sub() {

	System.out.println("Sub constructr is called.......");
	}
	int b = 2;
	@Override
	public void met() {
	
		super.met();
		System.out.println(b);
		System.out.println("Sub met called......");
		System.out.println(super.a);
	}
	
}