package factory.abstra.impl;

import factory.abstra.Cheese;
import factory.abstra.Clams;
import factory.abstra.Dough;
import factory.abstra.PizzaIngredientFactory;
import factory.abstra.Sauce;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {

		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {

		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {

		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(),
				new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {

		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {

		return new FreshClams();
	}

}
