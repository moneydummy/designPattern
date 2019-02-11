package com.design.strategy;

public class AddImplStrategy  implements IStrategy{

	@Override
	public void operation(int a, int b) {
		int sum=0;
		System.out.println("1.\tAdd Method Call");
		sum=a+b;
		System.out.println("Sum of Two number is : "+a+" + "+ b+" = "+sum);
	}
	

}
