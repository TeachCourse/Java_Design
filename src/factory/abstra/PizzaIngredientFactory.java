package factory.abstra;

import factory.abstra.impl.Pepperoni;
import factory.abstra.impl.Veggies;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public interface PizzaIngredientFactory {
	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Pepperoni createPepperoni();

	Clams createClam();
}
