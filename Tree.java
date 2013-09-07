package com.group12_1.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//@author Dmitry Kuratnik

public class Tree {
	int numApple;
	Apple apple;
	Random rnd = new Random();
	
	List<Apple> apl = new ArrayList<Apple>();
	
		public Tree(){
		numApple = rnd.nextInt(100);
	}
	
	public int grow(){
		for(int i = 0; i < numApple; i++)
			apl.add(apple = new Apple(rnd.nextInt(10), rnd.nextBoolean()));
		return apl.size();
	} 
	  
	public int dropApple(){
		drop = rnd.nextInt(apl.size());
		int n = apl.size()-drop;
		for (int i = apl.size(); i > n; i--){
			if(apl.get(i-1).getRipe()) apl.remove(i-1);
			}
	}

}

