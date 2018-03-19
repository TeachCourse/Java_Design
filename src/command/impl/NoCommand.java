package command.impl;

import command.Command;

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
