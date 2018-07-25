package com.seymour.abstractfactory;

public class AbstractFactoryLauncher {
	
	public static void main(String[] args) {
		
		EnemyShipBuilding enemyShipBuilding = new UFOEnemyShipBuilding();
		
		EnemyShip regularUFO = enemyShipBuilding.commandShip("UFO");
		System.out.println(regularUFO);

		EnemyShip bossUFO = enemyShipBuilding.commandShip("Boss UFO");
		System.out.println(bossUFO);
	}
}
