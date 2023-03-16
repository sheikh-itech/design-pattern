package com.general.design.creational.builder;

public class PhoneBuilder {

	public PhoneType buildApple() {
		
		PhoneType t = new PhoneType();
		t.addItem(new Apple());
		return t;
	}
	
	public PhoneType buildOnePlus() {
		
		PhoneType t = new PhoneType();
		t.addItem(new OnePlus());
		return t;
	}
	
	public PhoneType buildRedmi() {
		
		PhoneType t = new PhoneType();
		t.addItem(new Redmi());
		return t;
	}

	public PhoneType buildSamsung() {
		
		PhoneType t = new PhoneType();
		t.addItem(new Samsung());
		return t;
	}
}
