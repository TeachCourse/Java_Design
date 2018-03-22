package command.impl;

import command.Command;
import command.Light;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();

	}

}
