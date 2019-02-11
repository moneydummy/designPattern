package com.design.singleton;

/*
 * Singleton Class
 * 
 * Addition Methods that resolve Singleton problem.
 */
public class Singleton {

	public static Singleton uniqueInstance; //Global Access
	private boolean empty;
	private boolean boiled;
	
	private Singleton(){
			empty=true;
			boiled=false;
	}
	//Get Single Instance
	public static Singleton getInstance(){
		if(uniqueInstance ==null){
			uniqueInstance= new Singleton();
		}
		return uniqueInstance;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	public void fill(){
		if(isEmpty()){
			
			this.empty=true;
			boiled=false;
		}
		
	}
	public void drain(){
		if(!isEmpty() && isBoiled()){
			empty = true;
			
		}
	}
	
	public void boiled(){
		if(!isEmpty() && !isEmpty()){
			boiled=true;
		}
	}
	
	
	/*
	 * Synchornized Keyword
	 */
	/*public static synchronized Singleton getInstance(){
		if(uniqueInstance ==null){
			uniqueInstance= new Singleton();
		}
		return uniqueInstance;
	}*/
	
	
	/*
	 * Early Created instance
	 * instead of lazily created one
	 */
	
	/*public static Singleton uniqueInstance = new Singleton();*/
	
	/*
	 * Double Locking Mechanism
	 */
	
	/*public static  Singleton getInstance(){
		synchronized (Singleton.class) {
			if(uniqueInstance ==null){
				uniqueInstance= new Singleton();
			}
		}
		return uniqueInstance;
	}*/
	
}
