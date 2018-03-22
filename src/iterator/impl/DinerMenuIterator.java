package iterator.impl;

import iterator.Iterator;
import iterator.MenuItem;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null)
			return false;
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

}
