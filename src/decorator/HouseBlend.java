package decorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {

		return 0.89;
	}

}
