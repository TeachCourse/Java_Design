package adapter.impl;

import adapter.Duck;
import adapter.Turkey;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		turkey.fly();

	}

}
