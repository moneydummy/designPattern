package com.design.Facorty;

public class Factory {

	public static Computer getType(String type,String ram,String modelNo,String speed){
		
		switch (type) {
		case "AppleMac":
				return new AppleMac(ram, modelNo, speed);
				
		case "WindowsPC":
				return new WindowsPC(ram, modelNo, speed);
		case "Server":
				return new Server(ram, modelNo, speed);
		default:
			System.out.println("Choose Incorrect Option \n Contact Mr.Lalo");
			return null;
		}
	}
}
