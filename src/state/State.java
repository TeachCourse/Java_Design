package state;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public interface State {
	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();
}
