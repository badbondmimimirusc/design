package com.seymour.abstractfactory;

public abstract class EnemyShipBuilding {

	public abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	public EnemyShip commandShip(String typeOfShip) {
		EnemyShip enemyShip = makeEnemyShip(typeOfShip);
		
		enemyShip.makeShip();
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		
		return enemyShip;
	}
}
