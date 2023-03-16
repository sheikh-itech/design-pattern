package com.general.design.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {

	private List<String> questions;
	private int current;
	
	public JavaQuestions(){
		current = 0;
		questions = new ArrayList<String>();
		questions.add("What is class? ");
		questions.add("What is interface? ");
		questions.add("What is abstraction? ");
	}
	
	public void newQuestion(String str) {
		questions.add(str);
		current++;
	}

	public void nextQuestion() {
		if(current<questions.size())
			System.out.println(questions.get(current++));
	}

	public void removeQuestion() {
		if(current<questions.size())
			questions.remove(current);
		if(current>0)
			current--;
	}

	public void diaplayQuestion() {
		System.out.println(questions.get(current));
	}

	public void diaplayAllQuestion() {
		for(String str:questions)
			System.out.println(str);
	}
}
