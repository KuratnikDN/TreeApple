package com.group12_1.tree;
//@author Dmitry Kuratnik

public class Apple {
	private boolean ripe;
	private int numStone;
	
	public Apple(int numStone, boolean ripe){
		this.ripe = ripe;
		this.numStone = numStone;
	}
	
	public boolean getRipe(){
		return ripe;
	}
	  
}
