package com.seymour.strategy.entities;

import com.seymour.strategy.strategies.ItFlys;

public class Bird extends Animal{

	public Bird() {
		super();
		flyingType = new ItFlys();
	}

	public void tweet() {
		System.err.println("tweet tweet");
	}
}
