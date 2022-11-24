package com.july.test.oops;

import java.util.Scanner;

public class Constructor5 {
	public static void main(String[] args) throws Exception {
//		BreakFastc obj = new BreakFastc();
		boo b = new boo();
//		lunch lu = new lunch();
		Scanner sc = new Scanner(System.in);
		String dd = sc.next();
		
		Class.forName(dd).newInstance();
}
}

class BreakFastc {

	public BreakFastc() {
	System.out.println("per obj created");

	}

}
class lunch {

	public lunch() {
	System.out.println("lunch obj created");

	}

}
class boo{
public boo() {
	System.out.println("uhsgfsdg");

}	
}