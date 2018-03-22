package decorator.impl;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + ",Whip";
	}

	@Override
	public double cost() {

		return 0.27 + beverage.cost();
	}
}
