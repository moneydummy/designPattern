package com.design.command;

public class SimpleRemote {
	
	Command[] onCommand ;
	Command[] offCommand ;
	
	public SimpleRemote() {

		onCommand = new Command[4];
		offCommand = new Command[4];
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		
		this.onCommand[slot]=onCommand;
		this.offCommand[slot]=offCommand;
				
	}
	
	
	public void buttonOnPress(int slot){
		onCommand[slot].execute();
	}
	
	public void buttonOffPress(int slot){
		offCommand[slot].execute();
	}

}
