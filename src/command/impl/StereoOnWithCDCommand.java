package command.impl;

import command.Command;
import command.Stereo;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();

	}

}
