package adapter.impl;

import adapter.Turkey;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");

	}

}
