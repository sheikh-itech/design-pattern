package com.general.design.structural.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		
		QuestionFormat questions = new QuestionFormat("Java Programming Language");  
	    questions.ques = new JavaQuestions();
	    questions.displayAll();
	    
	    questions.removeQuestion();
	    questions.nextQuestion();
	    questions.nextQuestion();
	    questions.newQuestion("What is String?");
	    questions.newQuestion("What is IO?");
	    questions.newQuestion("What is Streams?");
	    questions.displayAll();
	}
}
