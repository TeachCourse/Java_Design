package factory.simple;

import factory.simple.Pizza;
import factory.simple.impl.CheesePizza;
import factory.simple.impl.ClamPizza;
import factory.simple.impl.PepperoniPizza;
import factory.simple.impl.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type))
			pizza = new CheesePizza();
		else if ("pepperoni".equals(type))
			pizza = new PepperoniPizza();
		else if ("clam".equals(type))
			pizza = new ClamPizza();
		else if ("veggie".equals(type))
			pizza = new VeggiePizza();
		return pizza;
	}

}
