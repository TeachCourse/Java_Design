package command.impl;

import command.Command;
import command.Stereo;

public class StereoOffWithCDCommand implements Command {
	Stereo stereo;

	public StereoOffWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();

	}

	@Override
	public void undo() {
		stereo.on();

	}
}
