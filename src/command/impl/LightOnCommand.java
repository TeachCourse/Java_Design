package command.impl;

import command.Command;
import command.Light;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();

	}

}
