package com.general.design.creational.abstractfactory;

import com.general.design.creational.abstractfactory.bank.BankFactory;
import com.general.design.creational.abstractfactory.loan.LoanFactory;

public class AbstractFactoryProvider {

	public AbstractFactory getFactory(Service serviceType) {
		
		AbstractFactory factory;
		switch(serviceType) {
			
			case BANK: factory = new BankFactory();
			break;
			
			case LOAN: factory = new LoanFactory();
			break;
			
			default: factory = null; 
		}
		return factory;
	}
}
