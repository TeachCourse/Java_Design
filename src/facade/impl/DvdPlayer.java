package facade.impl;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class DvdPlayer {

	public void stop() {
		System.out
				.println("Top-0-Line DVD Player stopped 'Raiders of the Lost Ark'");
	}

	public void eject() {
		System.out.println("Top-0-Line DVD Player eject");
	}

	public void off() {
		System.out.println("Top-0-Line DVD Player off");
	}

	public void on() {
		System.out.println("Top-0-Line DVD Player on");

	}

	public void play(String movie) {
		System.out
				.println("Top-0-Line DVD Player playing 'Raiders of the Lost Ark'");

	}

}
