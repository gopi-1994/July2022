package com.july.test.oops;

public class Abstract2 {
public static void main(String args[]) {
	monkey obj = new monkey();
	obj.treeclimb();
	obj.walkin4legs();
	lion ob = new lion();
	ob.huntsdeer();
	ob.walkin4legs();
}
}

abstract class animal{
	public void walkin4legs() {
		System.out.println("Walking in four legs");

	}
}
class monkey extends animal{
	@Override
	public void walkin4legs() {// overrides the abstract method 
	System.out.println("walks with 2 legs also");
	}
	public void treeclimb() {
		System.out.println("Climbs tree");
	}
}

class lion extends animal{
	void huntsdeer() {
		System.out.println("hunts deer donw");

	}
}
