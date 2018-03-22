package strategy.impl;

import strategy.Duck;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {

		System.out.println("I'm a model duck");
	}

}
