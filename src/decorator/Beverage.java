package decorator;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
