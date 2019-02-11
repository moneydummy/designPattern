package com.design.command;

public class LivingRoomLightOn implements Command {

	Light light;
	String type;
	public LivingRoomLightOn(Light light, String item) {
		
		this.light=light;
		type=item;
	}
	@Override
	public void execute() {
		this.light.setGetItem(type);
		light.lightOn();
		
	}
	
}
