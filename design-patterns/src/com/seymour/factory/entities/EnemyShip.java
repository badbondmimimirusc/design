package com.seymour.factory.entities;

public abstract class EnemyShip {

	private String name;
	private double speed;
	private double directionX;
	private double directionY;
	private double damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDirectionX() {
		return directionX;
	}
	public void setDirectionX(double directionX) {
		this.directionX = directionX;
	}
	public double getDirectionY() {
		return directionY;
	}
	public void setDirectionY(double directionY) {
		this.directionY = directionY;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following hero ship");
	}
	
	public void damageHeroShip() {
		System.out.println(getName() + " damages hero ship " + getDamage() + " damage!");
	}
	
	
}
