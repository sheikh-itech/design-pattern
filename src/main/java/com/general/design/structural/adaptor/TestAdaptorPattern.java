package com.general.design.structural.adaptor;

/**
 *	it says- "converts the interface of a class into another interface that a client wants"
 */

public class TestAdaptorPattern {

	public static void main(String[] args) {

		Movable wagon = new WagonR();
		System.out.println("WagonR speed: "+wagon.speed());

		MovableAdaptor creta = new HyundaiCreta();
		System.out.println("Creta speed: "+creta.speed());
		
		creta = new HyundaiCreta(wagon);
		System.out.println("WagonR speed: "+creta.speed());
	}
}
