package com.design.bridge;

public class BridgeOP {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(new Red());
		Square sq= new Square(new Black());
		
		rect.getShape();
		sq.getShape();

	}

}
