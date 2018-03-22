package iterator.nature;

import iterator.MenuItem;

import java.util.Iterator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

		System.out.println("MENU\n----\nNBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);

	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ",");
			System.out.println(menuItem.getPrice() + ",");
			System.out.println(menuItem.getDescription());
		}
	}
}
