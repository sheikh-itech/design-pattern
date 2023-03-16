package com.general.design.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class PhoneType {

	private List<Packaging> items=new ArrayList<Packaging>();  
	
	public void addItem(Packaging packs) {    
		items.add(packs);  
	}  
	public void showItems(){  
		for (Packaging packs : items) {  
			System.out.println(packs.pack());  
		}   
	}
}
