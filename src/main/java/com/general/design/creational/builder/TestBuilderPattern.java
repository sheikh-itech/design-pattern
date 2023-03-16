package com.general.design.creational.builder;

/**
 *	It says- "construct a complex object from simple objects using step-by-step approach" 
 */

public class TestBuilderPattern {

	public static void main(String[] args) {

		PhoneBuilder builder = new PhoneBuilder();
		
		PhoneType phone = builder.buildApple();
		phone.showItems();
		phone = builder.buildOnePlus();
		phone.showItems();
		phone = builder.buildRedmi();
		phone.showItems();
		phone = builder.buildSamsung();
		phone.showItems();
	}
}
