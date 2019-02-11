package com.design.Facorty;

public class AppleMac extends Computer{

	private String ram,modelNo,speed;
	
	public AppleMac(String ram,String modelNo,String speed) {
		this.ram=ram;
		this.speed=speed;
		this.modelNo=modelNo;
	}
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return modelNo;
	}

	@Override
	public String getCPUSpped() {
		// TODO Auto-generated method stub
		return speed;
	}

}
