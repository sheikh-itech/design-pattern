package com.general.design.creational.abstractfactory.loan;

import com.general.design.creational.abstractfactory.AbstractFactory;
import com.general.design.creational.abstractfactory.BankType;
import com.general.design.creational.abstractfactory.LoanType;
import com.general.design.creational.abstractfactory.bank.Bank;

public class LoanFactory extends AbstractFactory {

	@Override
	public Loan getInterestRate(LoanType loanType) {
		Loan loan;
		
		switch(loanType) {
			
			case BUSINESS: loan = new BusinessLoan();
			break;
			
			case EDUCATION: loan = new EducationLoan();
			break;
			
			case PERSONAL: loan = new PersonalLoan();
			break;
			
			default: loan = null;
		}
		
		return loan;
	}

	@Override
	public Bank getBank(BankType bankType) {

		return null;
	}
}
