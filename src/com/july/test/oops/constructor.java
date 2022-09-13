package com.july.test.oops;

public class constructor {

public static void main(String[] args) {
	Projector sanyo=new Projector();
	
		sanyo.switchOn();
	sanyo.connect(new Computer(), new Mobile());
}
}
class Projector{
public Projector() {
	System.out.println("bulb is not added....");
}

public Projector(Bulb bulb) {
	System.out.println("bulb is added to projector...");
}

public Projector(Bulb bulb,Screen screen) {
	System.out.println("projector is supplied along with bulb and screen");
}
public void switchOn() {
	System.out.println("projector is switched on");
}

public void connect(Computer computer,Mobile mobile) {
	if(computer==null) {
		System.out.println("computer not connected....");
	}
	else {
		System.out.println("computer connected....");
	}
	if(mobile!=null) {
		System.out.println("mobile is also connected...");
		
	}
}
}
class Computer{

}
class Mobile{

}
class Bulb{

}
class Screen{

}