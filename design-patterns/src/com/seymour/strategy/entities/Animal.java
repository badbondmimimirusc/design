package com.seymour.strategy.entities;

import com.seymour.strategy.strategies.Flys;

public class Animal {

	private String name;
	private String height;
	private String weight;
	
	protected Flys flyingType;

	public void tryToFly() {
		flyingType.fly();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Flys getFlyingType() {
		return flyingType;
	}

	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", height=" + height + ", weight=" + weight + ", flyingType=" + flyingType
				+ "]";
	}
	

}
