package com.seymour.strategy.entities;

import com.seymour.strategy.strategies.CantFly;

public class Dog extends Animal {

	
	public Dog() {
		super();
		flyingType = new CantFly();
	}

	public void bark() {
		System.err.println("woof woof");
	}
}
