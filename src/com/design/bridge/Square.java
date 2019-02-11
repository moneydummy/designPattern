package com.design.bridge;

public class Square extends Shape {

	public Square(Color c) {
		super(c);
	}

	@Override
	void getShape() {
		System.out.println("Square.");
		color.getColor();
	}

}
