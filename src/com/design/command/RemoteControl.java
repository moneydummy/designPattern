package com.design.command;

public class RemoteControl {

	public static void main(String[] args) {
		
		Door door = new Door();
		Light light = new Light();
		
		LivingRoomLightOn lightOn= new LivingRoomLightOn(light,"Light");
		LivingLightOff lightOff= new LivingLightOff(light,"Light");
		
		GarageDoorOpen doorOpen = new GarageDoorOpen(door);
		GarageDoorClose doorClose = new GarageDoorClose(door);
		
		FanOn fnOn= new FanOn(light,"Fan");
		FanOff fanOff= new FanOff(light,"Fan");
		
		SimpleRemote remote = new SimpleRemote();
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, doorOpen, doorClose);
		remote.setCommand(2, fnOn, fanOff);
		
		
		remote.buttonOnPress(0);
		remote.buttonOffPress(1);
		remote.buttonOnPress(2);

	}

}
