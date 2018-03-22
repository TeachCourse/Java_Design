package factory.normal.impl;

import factory.normal.Pizza;
import factory.normal.PizzaStore;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if ("cheese".equals(type))
			return new ChicagoStyleCheesePizza();
		else if ("veggie".equals(type))
			return new ChicagoStyleVeggiePizza();
		else if ("clam".equals(type))

			return new ChicagoStyleClamPizza();
		else if ("pepperoni".equals(type))
			return new ChicagoStylePepperoniPizza();
		return null;
	}

}
