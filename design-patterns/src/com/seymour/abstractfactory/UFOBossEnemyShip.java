package com.seymour.abstractfactory;

public class UFOBossEnemyShip extends EnemyShip {

	EnemyShipFactory enemyShipFactory;
	
	public UFOBossEnemyShip(EnemyShipFactory enemyShipFactory) {
		
		this.enemyShipFactory = enemyShipFactory;
	}

	@Override
	public void makeShip() {
		
		enemyShipFactory.addESEngine();
		enemyShipFactory.addESWeapon();
	}

}
