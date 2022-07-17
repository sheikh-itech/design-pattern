package com.general.design.creational;

import java.io.Serializable;

/**
 *	To get State Back while De-serialization
 *	Need to override readResolve() method 
 *
 */
public class SingletonSerializable implements Serializable {

	private static final long serialVersionUID = 14325L;
	
	private static SingletonSerializable instance;
	
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
