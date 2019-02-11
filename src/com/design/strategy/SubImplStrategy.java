package com.design.strategy;

public class SubImplStrategy implements IStrategy {

	@Override
	public void operation(int a, int b) {
		int sum=0;
		System.out.println("2.\tSubtract Method Call");
		
		sum=a-b;
		System.out.println("Difference of Two number is : "+a+" - "+ b+" = "+sum);
	}
	

}
