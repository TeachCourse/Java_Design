package component.impl;

import java.util.Iterator;
import java.util.function.Consumer;

import component.MenuComponent;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();

	}

}
