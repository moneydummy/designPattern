package com.design.singleton;

public class FactoryMain {

	public static void main(String[] args) {
		
		ChoclateBoiler choc= new ChoclateBoiler();
		//ChoclateBoiler choc1= new ChoclateBoiler();
		choc.boiled();
		
		/*Singleton single= Singleton.getInstance();
		System.out.println(single.getInstance().hashCode());*/
	}

}
