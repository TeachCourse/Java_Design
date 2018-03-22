package facade.impl;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class Amplifier {

	public void off() {
		System.out.println("Top-0-Line amplifier off");
	}

	public void on() {
		System.out.println("Top-0-Line Amplifier on");

	}

	public void setDvd(DvdPlayer dvd) {
		System.out
				.println("Top-0-Line Amplifier setting DVD player to Top-0-Line DVD Player");

	}

	public void setSurroundSound() {
		System.out
				.println("Top-0-Line Amplifier surround sound on (5 speakers,1 subwoofer)");

	}

	public void setVolume(int i) {
		System.out.println("Top-0-Line Amplifier setting volume to 5");

	}

}
