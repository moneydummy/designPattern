package com.design.command;

public class Light {

	private String getItem;
	
	Light(){ }
	
	public void lightOn(){
		if(getItem.equals("Fan")){
			System.out.println(" Fan Swith is On");
		}
		else{
			System.out.println("Light Switch is On.");
		}
	}
	
	public void lightOff(){
		if(getItem.equals("Fan")){
			System.out.println(" Fan Swith is Off");
		}
		else{
			System.out.println("Light Switch is Off.");
		}
	}

	public String getGetItem() {
		return getItem;
	}

	public void setGetItem(String getItem) {
		this.getItem = getItem;
	}
}
