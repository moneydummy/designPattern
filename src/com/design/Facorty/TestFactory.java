package com.design.Facorty;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer fObj= Factory.getType("WindowsPC", "2 GB", "B2HDK23", "2.8 Ghz");
		Computer fObj1= Factory.getType("AppleMac", "6 GB", "ASO23KKS3", "1.9 Ghz");
		
		System.out.println(fObj.toString());
		System.out.println("----------");
		System.out.println(fObj1.toString());
	}

}
