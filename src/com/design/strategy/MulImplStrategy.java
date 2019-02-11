package com.design.strategy;

public class MulImplStrategy implements IStrategy {

	@Override
	public void operation(int a, int b) {
		System.out.println("3.\tMultiplication Method Call");
		int total=0;
		total=a*b;
		System.out.println("Multiplication of Two Number is : "+a+" * "+b+" = "+total);
	}

}
