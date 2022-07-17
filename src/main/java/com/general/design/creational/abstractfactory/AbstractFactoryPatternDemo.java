package com.general.design.creational.abstractfactory;

import com.general.design.creational.abstractfactory.bank.Bank;
import com.general.design.creational.abstractfactory.loan.Loan;

/**		Abstract Factory Pattern
 * 
 *	It says- Just define an interface or abstract class for creating
 *	Families of related (or dependent) objects but 
 *	Without specifying their concrete sub-classes
 *	
 *	That means Abstract Factory lets a class returns a factory of classes
 *
 *	It is one level higher then Factory Pattern
 *
 *	How object are created, composed, and represented
 *	Configured with one of Multiple family of objects
 */

public class AbstractFactoryPatternDemo {

	public static void main(String []args) {
	
		AbstractFactoryProvider factoryProvider = new AbstractFactoryProvider();
	
		AbstractFactory factory = factoryProvider.getFactory(Service.BANK);
		Bank bank =factory.getBank(BankType.HDFC);
		
		factory = factoryProvider.getFactory(Service.LOAN);
		Loan loan = factory.getInterestRate(LoanType.BUSINESS);
		
		System.out.println(bank.getBankName()+" giving "+LoanType.BUSINESS+" loan @"+loan.getInterestRate()+"/month");
	}
	
}
