package command.impl;

import command.Command;
import command.GarageDoor;
/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
	}

}
