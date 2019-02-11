package com.design.bridge;

public class Rectangle extends Shape{

	public Rectangle(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getShape() {
		System.out.println("Triangle Shape.");
		color.getColor();
		
	}

	
}
