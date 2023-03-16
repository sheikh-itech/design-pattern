package com.general.design.structural.bridge;

/**
 *	Here Question will act as bridge between QuestionManager And JavaQuestion 
 */
public class QuestionManager {
	
	protected Question ques;
	private String catalog;
	
	public QuestionManager(String catalog) {
		this.catalog = catalog;
	}
	
	public void newQuestion(String str) {
		ques.newQuestion(str);
	}

	public void nextQuestion() {
		ques.nextQuestion();
	}

	public void removeQuestion() {
		ques.removeQuestion();
	}

	public void diaplayQuestion() {
		ques.diaplayQuestion();
	}

	public void diaplayAllQuestion() {
		System.out.println("Question Paper: " + catalog);
		ques.diaplayAllQuestion();
	}
}
