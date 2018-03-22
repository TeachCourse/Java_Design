package decorator.impl;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Milk extends CondimentDecorator {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + ",Milk";
	}

	@Override
	public double cost() {

		return 1.20 + beverage.cost();
	}

}
