package strategy.impl;

import strategy.Duck;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class MallarDuck extends Duck {
	public MallarDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");

	}

}
