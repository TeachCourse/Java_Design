package factory.abstra;

import factory.abstra.impl.Pepperoni;
import factory.abstra.impl.Veggies;

public interface PizzaIngredientFactory {
	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Pepperoni createPepperoni();

	Clams createClam();
}
