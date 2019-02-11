package com.design.command;

public class FanOn implements Command{
	
	Light fan;
	String item;
	public FanOn(Light fan,String item) {
		
		this.fan=fan;
		this.item=item;
	}
	@Override
	public void execute() {
		this.fan.setGetItem(item);
		fan.lightOn();
		
	}

}
