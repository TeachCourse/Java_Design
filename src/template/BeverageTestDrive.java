package template;

import template.impl.CoffeeWithHook;
import template.impl.TeaWithHook;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class BeverageTestDrive {
	public static void main(String[] args) {
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();

		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();

		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
