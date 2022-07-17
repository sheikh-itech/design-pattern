package com.general.design.creational.factory;

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
