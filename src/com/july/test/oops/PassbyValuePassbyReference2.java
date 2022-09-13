package com.july.test.oops;

public class PassbyValuePassbyReference2 {

	public static void main(String[] args) {
		stud me = new stud();
		String word = "hai";// pass by value
		System.out.println("Before adding value"+word);
		me.tell(word);
		System.out.println("after adding value"+word);
		Suag suag = new Suag();// Pass by reference
System.out.println("Before reference  "+suag.weight);
		me.accsuga(suag);
		System.out.println("After reference  "+suag.weight);
		
	}
}
class Suag{
	int weight = 100;
}

class stud{
//	pass by reference
	public void accsuga(Suag s) {
		s.weight=s.weight-10;

	}
	// pass by value
	public void tell(String wrd) {
		wrd ="Hello";

	}
}
