package decorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {

		return 1.99;
	}

}
