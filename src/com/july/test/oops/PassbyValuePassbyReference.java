package com.july.test.oops;

public class PassbyValuePassbyReference {

	public static void main(String[] args) {
		work me = new work();
		Office office = new Office();
		office.ofiwork(me);	
	}
}


class work{
	public void empework() {
		System.out.println("Employee is working");

	}
}
class Office{
	public void ofiwork(work wrk ) {
wrk.empework();

	}
}