package com.design.command;

public class LivingLightOff implements Command {

	Light light;
	String type;
	public LivingLightOff(Light light,String item) {
		type=item;
		this.light=light;
		
	}
	@Override
	public void execute() {
		this.light.setGetItem(type);
		light.lightOff();
		
	}
}
