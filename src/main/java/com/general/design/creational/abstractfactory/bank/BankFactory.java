package com.general.design.creational.abstractfactory.bank;

import com.general.design.creational.abstractfactory.AbstractFactory;
import com.general.design.creational.abstractfactory.BankType;
import com.general.design.creational.abstractfactory.LoanType;
import com.general.design.creational.abstractfactory.loan.Loan;

public class BankFactory extends AbstractFactory {
	
	public Bank getBank(BankType bankType) {
		
		Bank bank;
		switch(bankType) {
			case HDFC: bank = new HDFC();
			break;
			
			case ICICI: bank = new ICICI();
			break;
			
			case SBI: bank = new SBI();
			break;
			
			default: bank = null;
		}
		return bank;
	}

	@Override
	public Loan getInterestRate(LoanType loanType) {
		
		return null;
	}
}
