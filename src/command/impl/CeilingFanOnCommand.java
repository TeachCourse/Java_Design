package command.impl;

import command.CeilingFan;
import command.Command;
import command.Light;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.high();
	}

	@Override
	public void undo() {

	}

}
