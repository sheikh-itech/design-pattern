package com.general.design.creational.factory;

/**			FactoryMethodPattern
 * 
 *	It says- Just define an Interface or Abstract Class for creating an Object
 *	But let the subclasses decide which class to instantiate
 *
 *	Subclasses are responsible to create the instance of the class
 *	
 *	It promotes the loose-coupling
 */

public class FoodOrderFactory {

	public Food getMenu(Type type) {
		
		Food food;
		switch(type) {
			
			case VEG: food = new Veg();
			break;
			
			case NONVEG: food = new NONVEG();
			break;
			
			case ITALIAN: food = new ITALIAN();
			break;
			
			case EGGETARIAN: food = new EGGETARIAN();
			break;
			
			default: food = null;
		}
		return food;
	}
}
