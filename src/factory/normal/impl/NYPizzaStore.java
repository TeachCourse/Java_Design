package factory.normal.impl;

import factory.normal.Pizza;
import factory.normal.PizzaStore;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if ("cheese".equals(type))
			return new NYStyleCheesePizza();
		else if ("veggie".equals(type))
			return new NYStyleVeggiePizza();
		else if ("clam".equals(type))

			return new NYStyleClamPizza();
		else if ("pepperoni".equals(type))
			return new NYStylePepperoniPizza();
		return null;
	}

}
