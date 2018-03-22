package factory.abstra.impl;

import factory.abstra.Pizza;
import factory.abstra.PizzaIngredientFactory;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
