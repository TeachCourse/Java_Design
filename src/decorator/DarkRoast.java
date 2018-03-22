package decorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {

		return 1.33;
	}

}
