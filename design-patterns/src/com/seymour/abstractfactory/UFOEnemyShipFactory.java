package com.seymour.abstractfactory;

public class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESWeapon() {
		// TODO Auto-generated method stub
		return new UFOESWeapon();
	}

	@Override
	public ESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new UFOESEngine();
	}

}
