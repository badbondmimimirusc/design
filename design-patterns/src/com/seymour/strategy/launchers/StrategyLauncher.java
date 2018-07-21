package com.seymour.strategy.launchers;

import com.seymour.strategy.entities.Animal;
import com.seymour.strategy.entities.Bird;
import com.seymour.strategy.entities.Dog;

public class StrategyLauncher {

	public static void main(String[] args) {
		Animal bailey = new Dog();
		Animal tweety = new Bird();
		
		bailey.tryToFly();
		tweety.tryToFly();
	}
}
