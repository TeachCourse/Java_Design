package command.impl;

import command.CeilingFan;
import command.Command;
import command.Light;

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
