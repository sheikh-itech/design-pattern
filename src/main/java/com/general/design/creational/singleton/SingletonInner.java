package com.general.design.creational.singleton;

public class SingletonInner {

	private SingletonInner() {	}
	
	private static class Inner {
		
		private static final SingletonInner instance = new SingletonInner();
	}
	
	public static SingletonInner getInstance() {
		
		return SingletonInner.Inner.instance;
	}
}
