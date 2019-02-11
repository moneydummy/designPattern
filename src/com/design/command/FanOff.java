package com.design.command;

public class FanOff implements Command {

	Light fan;
	String item;
	public FanOff(Light fan,String item) {
		this.fan=fan;
		this.item=item;
	}
	@Override
	public void execute() {
		this.fan.setGetItem(item);
		fan.lightOff();
		
	}
	
	
}
