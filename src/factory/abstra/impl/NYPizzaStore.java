package factory.abstra.impl;

import factory.abstra.Pizza;
import factory.abstra.PizzaIngredientFactory;
import factory.abstra.PizzaStore;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if ("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		} else if ("clam".equals(type))

		{
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style PepperoniPizza Pizza");
		}
		return pizza;
	}

}
