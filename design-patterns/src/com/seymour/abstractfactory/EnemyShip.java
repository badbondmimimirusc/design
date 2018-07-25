package com.seymour.abstractfactory;

public abstract class EnemyShip {

	ESWeapon weapon;
	ESEngine engine;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void makeShip();

	public void followHeroShip() {
		System.out.println(getName() + " is following the hero at " + engine);
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}

	public String toString() {
		String infoOnShip = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;

		return infoOnShip;
	}
}
