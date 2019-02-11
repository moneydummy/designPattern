package com.design.Adapter;

public class WildTurkey implements Turkey{

	@Override
	public void fly() {
		System.out.println("Tt's Fly not for Long Distance.");
	}

	@Override
	public void gobble() {
		System.out.println("Gobble...gobble...");
	}

}
