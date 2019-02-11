package com.design.Adapter;

public class AdapterTurkey implements Duck {

	Turkey turkey;
	
	public AdapterTurkey(Turkey turkey){
		this.turkey= turkey;
	}
	@Override
	public void quak(){
		this.turkey.gobble();
	}
	@Override
	public void fly() {
		turkey.fly();
	}
}
