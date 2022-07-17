package com.general.design.creational.factory;

/**
 *	1. Call Factory
 *	2. Choose Menu from Factory
 *	3. Order Food
 */

public class HotelBarbequeVille {

	public static void main(String[] args) {

		FoodOrderFactory factory = new FoodOrderFactory();
		
		//Customer-1
		Food menu = factory.getMenu(Type.VEG);
		menu.orderFood();

		//Customer-2
		factory.getMenu(Type.NONVEG).orderFood();
		
		//Customer-3
		factory.getMenu(Type.ITALIAN).orderFood();

		//Customer-4
		factory.getMenu(Type.EGGETARIAN).orderFood();
	}
}
