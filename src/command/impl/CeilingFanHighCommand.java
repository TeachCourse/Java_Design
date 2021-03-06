package command.impl;

import command.CeilingFan;
import command.Command;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH)
			ceilingFan.high();
		else if (prevSpeed == CeilingFan.MEDIUM)
			ceilingFan.medium();
		else if (prevSpeed == CeilingFan.LOW)
			ceilingFan.low();
		else if (prevSpeed == CeilingFan.OFF)
			ceilingFan.off();

	}

}
