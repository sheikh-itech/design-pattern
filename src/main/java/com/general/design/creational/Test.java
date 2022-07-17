package com.general.design.creational;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("SingletonEarly1: "+SingletonEarly.getInstance().hashCode());
		System.out.println("SingletonEarly2: "+SingletonEarly.getInstance().hashCode());

		System.out.println("SingletonLazy1: "+SingletonLazy.getInstance().hashCode());
		System.out.println("SingletonLazy2: "+SingletonLazy.getInstance().hashCode());
	}
}
