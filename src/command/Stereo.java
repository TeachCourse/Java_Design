package command;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Stereo {
	String name;

	public Stereo(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " stereo is on");
	}

	public void setCd() {
		System.out.println(name + " stereo is set for CD input");
	}

	public void setVolume(int i) {
		System.out.println(name + " stereo volume set to " + i);
	}

	public void setDvd() {

	}

	public void setRadio() {

	}

	public void off() {
		System.out.println(name + " stereo is off");
	}
}
