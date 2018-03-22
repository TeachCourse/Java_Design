package command.impl;

import command.Command;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No Command...");
	}

	@Override
	public void undo() {
		System.out.println("No Command Undo...");

	}

}
