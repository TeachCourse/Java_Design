package strategy.impl;

import strategy.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");

	}

}
