package com.design.strategy;

public class Service {
	 IStrategy strategy;
	 
	 public Service(IStrategy strategy){
		 this.strategy=strategy;
	 }

	 public void execute(int a,int b){
		 this.strategy.operation(a, b);
	 }
}
