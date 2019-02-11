package com.design.singleton;

/*
 * Why we need Single Instance though out the Application
 * Below an example shows 
 * Required only one instance
 */
/*
 * Class Chocolate Boiler
 * Bad thing donot happen
 * 1. Donot drain when is empty
 * 2. Donot fill when is already filled
 */
public class ChoclateBoiler {

	private boolean empty=true;
	private boolean boiled=false;
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	public void fill(){
		if(isEmpty()){
			
			this.empty=true;
			boiled=false;
		}
		
	}
	public void drain(){
		if(!isEmpty() && isBoiled()){
			empty = true;
			
		}
	}
	
	public void boiled(){
		if(!isEmpty() && !isEmpty()){
			boiled=true;
		}
	}
}
