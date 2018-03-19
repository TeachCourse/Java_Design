package facade;

import facade.impl.Amplifier;
import facade.impl.CdPlayer;
import facade.impl.DvdPlayer;
import facade.impl.PopcornPopper;
import facade.impl.Projector;
import facade.impl.Screen;
import facade.impl.TheaterLights;
import facade.impl.Tuner;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd,
				cd, projector, lights, screen, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
