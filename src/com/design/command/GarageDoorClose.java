package com.design.command;

public class GarageDoorClose implements Command {
	
	Door door;
	public GarageDoorClose(Door door) {
		this.door=door;
	}

	@Override
	public void execute() {
		door.closeDoor();
	}

}
