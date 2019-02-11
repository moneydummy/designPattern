package com.design.Adapter;

public class MallardDuck implements Duck{

	@Override
	public void fly() {
		System.out.println("It's Fly for Long Distance..!");
		
	}

	@Override
	public void quak() {
		System.out.println("Quak...Quak...Quak...");
	}

}
