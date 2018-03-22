package strategy.impl;

import strategy.FlyBehavior;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");

	}

}
