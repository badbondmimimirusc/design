package com.seymour.factory.factories;

import com.seymour.factory.entities.BigUFOEnemyShip;
import com.seymour.factory.entities.EnemyShip;
import com.seymour.factory.entities.RocketEnemyShip;
import com.seymour.factory.entities.UFOEnemyShip;

	public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String shipType) {

		switch (shipType) {

		case "U":
			return new UFOEnemyShip();
				
		case "R":
			return new RocketEnemyShip();
				
		case "B":
			return new BigUFOEnemyShip();
				
		default:
			return null;
		}
	}
}
