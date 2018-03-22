package command;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class CeilingFan {
	String name;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	String location;
	int speed;

	public CeilingFan(String name) {
		this.name = name;
		speed = OFF;
	}

	public void high() {
		speed = HIGH;
		System.out.println(name + " ceiling fan is on high");
	}

	public void medium() {
		speed = MEDIUM;
	}

	public void low() {
		speed = LOW;
	}

	public void off() {
		speed = OFF;
		System.out.println(name + " ceiling fan is off");
	}

	public int getSpeed() {
		return speed;
	}
}
