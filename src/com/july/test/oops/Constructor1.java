package com.july.test.oops;

public class Constructor1 {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.met1());
		
		
		
	}

}
 class A{
	 
	public A() {
		
		System.out.println("calling the constructor ");
	}
	
	public A(String S) {
		System.out.println("overloading consrtucotr");
	}
	public A(String S, int i) {
		System.out.println("Overloading construcot with integer");
	}
	public void met() {
// no return method
	}
	public void met(String S) {
		System.out.println("parmaetr method caling.........");
			}
	public int met1() {
		
		return 5;
	}
 }
