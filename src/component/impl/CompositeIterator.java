package component.impl;

import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

import component.MenuComponent;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.empty())
			return false;
		else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else
				return true;
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu)
				stack.push(component.createIterator());
			return component;
		}
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
