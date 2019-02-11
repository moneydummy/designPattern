package com.design.Facorty;

public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getModel();
	public abstract String getCPUSpped();
	
	@Override
	public String toString(){
		StringBuilder sb= new StringBuilder();
		
		sb.append("Ram of "+this.getClass().getSimpleName()+" is = "+getRam()
				+"\nModel Number is = "+getModel()
				+"\n CPU Speed is = "+getCPUSpped()
				);
		return sb.toString();
	}
}
