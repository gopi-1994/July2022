package com.july.test.oops;

public class ComplexType {

	public static void main(String[] args) {
		ComplexType o1= new ComplexType();
		One o2 = new One();
		System.out.println("original size of me "+o2.size);
		o1.passByValue();
		System.out.println("pass by value size of me "+o1.passByValue());
		System.out.println("pass by value size of me "+o2.size);
		o1.passByReference(o2);
		System.out.println("after passing reference "+o2.size);
	}
	public int passByValue(){
		int size=3;
		return size;
	}
	public void passByReference(One me) {
		me.size=5;

	}
}
class One {
	int size=10;
	
}
