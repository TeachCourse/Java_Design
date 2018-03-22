package component.impl;

import java.util.Iterator;

import component.MenuComponent;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println("," + getPrice());
		System.out.println("  --" + getDescription());
	}

	@Override
	public Iterator<MenuComponent> createIterator() {

		return new NullIterator();
	}

}
