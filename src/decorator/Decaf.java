package decorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {

		return 0.32;
	}

}
