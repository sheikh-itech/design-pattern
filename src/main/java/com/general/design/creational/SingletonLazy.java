package com.general.design.creational;

/**
 *	Singleton pattern is mostly used in Multi-Threaded and database applications
 *	It is used in-
 *	1. logging
 *	2. Caching
 *	3. Thread pools
 *	4. Configuration settings
 */

public final class SingletonLazy {

	private static SingletonLazy instance;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstance() {
		
		if(null==instance) {
			synchronized (SingletonLazy.class) {
				if(null==instance)
					instance = new SingletonLazy();
			}
		}
		return instance;
	}
}
