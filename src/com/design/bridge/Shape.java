package com.design.bridge;

abstract public class Shape {
	
	Color color;
	 
	public Shape(Color c) {
		color=c;
	}
	abstract void getShape();

}
