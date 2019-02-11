package com.design.Adapter;

public class DuckTestDrive {
	
	public static void main(String[] args){
		String OS = System.getProperty("os.name");
	System.out.println(OS.contains("WINDOWS 10"));
	MallardDuck duckObj= new MallardDuck();
	WildTurkey wildTurkeyObj = new WildTurkey();
	AdapterTurkey adptTurkery= new AdapterTurkey(wildTurkeyObj);
	
	getState(duckObj);
	System.out.println("--------------");
	getState(adptTurkery);
	}
	
	public static void getState(Duck duck){
		System.out.println(duck.getClass());
		duck.quak();
		duck.fly();
	}
	
	

}
