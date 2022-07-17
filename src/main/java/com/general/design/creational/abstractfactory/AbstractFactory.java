package com.general.design.creational.abstractfactory;

import com.general.design.creational.abstractfactory.bank.Bank;
import com.general.design.creational.abstractfactory.loan.Loan;

public abstract class AbstractFactory {
	
	abstract public Loan getInterestRate(LoanType loanType);
	abstract public Bank getBank(BankType bankType);
}
