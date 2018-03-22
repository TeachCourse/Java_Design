package adapter.impl;

import adapter.Duck;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
