package com.general.design.creational.singleton;

import java.io.Serializable;

/**
 *	To get State Back while De-serialization
 *	Need to override readResolve() method
 *	
 *	Volatile -> to prevent from concurrent modification
 */

public class SingletonSerializable implements Serializable {

	private static final long serialVersionUID = 14325L;
	
	private static volatile SingletonSerializable instance;
	
	private SingletonSerializable() {
		
	}
	
	public static SingletonSerializable getInstance() {
		
		if(null==instance) {
			synchronized (SingletonLazy.class) {
				if(null==instance)
					instance = new SingletonSerializable();
			}
		}
		return instance;
	}

	protected Object readResolve() {
		
        return getInstance();  
    } 
}
