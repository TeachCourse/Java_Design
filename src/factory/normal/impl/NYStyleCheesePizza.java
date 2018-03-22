package factory.normal.impl;

import factory.normal.Pizza;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
	}

}
