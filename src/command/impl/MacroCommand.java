package command.impl;

import command.Command;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class MacroCommand implements Command {
	Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}

}
