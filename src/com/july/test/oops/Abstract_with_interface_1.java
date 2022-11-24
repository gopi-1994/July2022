package com.july.test.oops;

public class Abstract_with_interface_1 {
	public static void main(String[] args) {
		ShoeShop shop = new AShop();
		shoefactory fac = new batashoefactory();
		shop.factory=fac;
		fac.boorrr();
		System.out.println(shop.sellsho());
	}
}

abstract class shoe {

}

class Leathershoe extends shoe {
	void leatherout() {
		System.out.println("this is one leather shoe");

	}
}

class soprtsshoe extends shoe {
}

interface shoemaker {
	public shoe makeshoe();
}

abstract class shoefactory implements shoemaker {
	public void boorrr() {
		System.out.println("hgdhfghgd");

	}
}

class batashoefactory extends shoefactory {
	@Override
	public shoe makeshoe() {
		System.out.println("this is a bata leather shoe");
		return new Leathershoe();
	}

}

class nikeFactory extends shoefactory {
	@Override
	public shoe makeshoe() {

		return new soprtsshoe();
	}
}

interface Shoeseller {
	public shoe sellsho();
}

abstract class ShoeShop implements Shoeseller {

	shoefactory factory;
}

class AShop extends ShoeShop {

	@Override
	public shoe sellsho() {

		return factory.makeshoe();
	}
}

