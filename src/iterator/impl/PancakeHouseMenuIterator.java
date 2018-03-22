package iterator.impl;

import java.util.ArrayList;

import iterator.Iterator;
import iterator.MenuItem;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> menuItems;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems == null)
			return false;
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}

}
