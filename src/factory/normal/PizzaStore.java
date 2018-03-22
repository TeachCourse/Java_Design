package factory.normal;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String type);
}
