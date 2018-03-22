package component;

import component.impl.Menu;
import component.impl.MenuItem;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU",
				"Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAKE MENU", "Dinner");
		MenuComponent desserMenu = new Menu("DESSERT MENU", "Dessert of course");

		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		dinerMenu.add(new MenuItem("Pasta",
				"Spaghetti with Marinara Sauce,and a slice of sourdough bread",
				true, 3.89));
		dinerMenu.add(desserMenu);

		desserMenu.add(new MenuItem("Apple Pie",
				"Apple pie with a flakey crust,topped with vanilla ice cream",
				true, 1.59));

		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();

	}
}
