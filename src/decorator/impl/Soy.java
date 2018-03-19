package decorator.impl;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + ",Soy";
	}

	@Override
	public double cost() {

		return 1.27 + beverage.cost();
	}
}
