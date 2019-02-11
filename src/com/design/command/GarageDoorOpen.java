package com.design.command;

public class GarageDoorOpen implements Command {
	
	Door door;
	public GarageDoorOpen(Door door) {
		this.door=door;
	}

	@Override
	public void execute() {
		door.openDoor();
	}

}
