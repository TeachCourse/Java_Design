package factory.abstra.impl;

import factory.abstra.Cheese;
import factory.abstra.Clams;
import factory.abstra.Dough;
import factory.abstra.PizzaIngredientFactory;
import factory.abstra.Sauce;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]={new BlackOlives(),new Spinach(),new EggPlant(),new Mozzarella()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		
		return new FrozenClams();
	}

}
