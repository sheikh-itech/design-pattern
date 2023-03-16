package com.general.design.structural.bridge;

public class QuestionFormat extends QuestionManager {

	public QuestionFormat(String catalog){  
		super(catalog);  
	}  
	public void displayAll() {  
		System.out.println("\n---------------------------------------------------------");  
		super.diaplayAllQuestion(); 
		System.out.println("-----------------------------------------------------------");  
	}
}
