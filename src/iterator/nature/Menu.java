package iterator.nature;

import iterator.MenuItem;

import java.util.Iterator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public interface Menu {
	Iterator<MenuItem> createIterator();
}
