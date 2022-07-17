package com.general.design.creational;

/**
 *	Singleton Pattern says:
 *	"Define a class that has only one instance and 
 *	 provides a global point of access to it"
 *
 *	1. Final ->No Subclasses
 *	2. Private Constructor -> No Outside Object Creation
 *	3. Static Block -> Handle Object Creation
 *
 * 	Singleton pattern is mostly used in Multi-Threaded and database applications
 *	It is used in-
 *	1. logging
 *	2. Caching
 *	3. Thread pools
 *	4. Configuration settings
 */

public final class SingletonEarly {
	
	private static SingletonEarly instance;
	
	/**	Object Handling Not Possible Here */
	//private static SingletonEarly instance = new SingletonEarly();
	
	private SingletonEarly() {
		
	}
	
	static {
		
		instance = new SingletonEarly();
	}
	
	public static SingletonEarly getInstance() {
		
		return instance;
	}
}
