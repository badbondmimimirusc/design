package com.seymour.strategy.strategies;

public class CantFly implements Flys {

	@Override
	public void fly() {

		System.err.println("I cant fly :(");
	}

}
