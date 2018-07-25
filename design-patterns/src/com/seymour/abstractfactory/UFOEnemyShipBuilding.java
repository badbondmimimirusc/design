package com.seymour.abstractfactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	public EnemyShip makeEnemyShip(String typeOfShip) {
		
		EnemyShip enemyShip = null;
		if(typeOfShip.equals("UFO")) {
			EnemyShipFactory enemyShipFactory = new UFOEnemyShipFactory();
			enemyShip = new UFOEnemyShip(enemyShipFactory);
			enemyShip.setName("Regular UFO Ship");
		}
		if(typeOfShip.equals("Boss UFO")) {
			EnemyShipFactory enemyShipFactory = new UFOBossEnemyShipFactory();
			enemyShip = new UFOBossEnemyShip(enemyShipFactory);
			enemyShip.setName("Boss UFO Ship");
		}
		
		return enemyShip;
	}

}
