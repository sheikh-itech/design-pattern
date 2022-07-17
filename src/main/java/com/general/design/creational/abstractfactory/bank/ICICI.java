package com.general.design.creational.abstractfactory.bank;

public class ICICI implements Bank {
	
	private String bankName;
	
	ICICI() {
		bankName = "ICICI Bank";
	}
	
	public String getBankName() {
		
		return bankName;
	}
}
