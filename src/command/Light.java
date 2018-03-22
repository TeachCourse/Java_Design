package command;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Light {
	String name;

	public Light(String name) {
		this.name = name;
	}

	public void off() {
		System.out.println(name + " light is off");
	}

	public void on() {
		System.out.println(name + " light is on");
	}

}
