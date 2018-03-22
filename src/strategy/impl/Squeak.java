package strategy.impl;

import strategy.QuackBehavior;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");

	}

}
