package com.general.design.creational.abstractfactory.bank;

public class SBI implements Bank {
	
	private String bankName;
	
	SBI() {
		bankName = "SBI Bank";
	}
	
	public String getBankName() {
		
		return bankName;
	}
}
