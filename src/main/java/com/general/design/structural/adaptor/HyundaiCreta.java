package com.general.design.structural.adaptor;

public class HyundaiCreta implements MovableAdaptor {
	
	private Movable movable;
	
	public HyundaiCreta(Movable movable) {
		this.movable = movable;
	}
	
	public HyundaiCreta() {
		
	}
	
	public double speed() {
		if(null!=this.movable)
			return 120*0.7;
		
		return 120;
	}
}
