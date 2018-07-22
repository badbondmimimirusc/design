package com.seymour.factory.launchers;

import java.util.Scanner;

import com.seymour.factory.entities.EnemyShip;
import com.seymour.factory.factories.EnemyShipFactory;

public class FactoryLauncher {

	public static void main(String[] args) {

		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

		EnemyShip enemyShip;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What type of ship? U / R / B ?");

		if (scanner.hasNextLine()) {
			String shipType = scanner.nextLine();

			enemyShip = enemyShipFactory.makeEnemyShip(shipType);

			if (enemyShip != null) {
				doStuffEnemy(enemyShip);
			} else {
				System.err.println("Invalid input");
			}
		}
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {

		anEnemyShip.followHeroShip();

		anEnemyShip.damageHeroShip();

	}

}
