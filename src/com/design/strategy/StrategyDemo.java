package com.design.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		
		Service serviceObj1= new Service(new AddImplStrategy());
		Service serviceObj2= new Service(new SubImplStrategy());
		Service serviceObj3= new Service(new MulImplStrategy());
		
		serviceObj1.execute(10,20);
		serviceObj2.execute(50,20);
		serviceObj3.execute(2,20);
		
		
	}

}
