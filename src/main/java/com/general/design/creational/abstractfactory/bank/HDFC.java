package com.general.design.creational.abstractfactory.bank;

public class HDFC implements Bank {

	private String bankName;
	
	HDFC() {
		bankName = "HDFC Bank";
	}
	
	public String getBankName() {
		
		return bankName;
	}
}
