package com.seymour.abstractfactory;

public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory enemyShipFactory;
	
	public UFOEnemyShip(EnemyShipFactory enemyShipFactory) {
		
		this.enemyShipFactory = enemyShipFactory;
	}



	@Override
	public void makeShip() {
		
		enemyShipFactory.addESEngine();
		enemyShipFactory.addESWeapon();
	}

}
