package com.seymour.abstractfactory;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESWeapon() {
		// TODO Auto-generated method stub
		return new UFOESBossWeapon();
	}

	@Override
	public ESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new UFOESBossEngine();
	}

}
