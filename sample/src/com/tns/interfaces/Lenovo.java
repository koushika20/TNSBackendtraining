package com.tns.interfaces;

public class Lenovo implements Laptop{

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");
		
	}

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}
	
	public void security()
	{
		System.out.println("Lenovo security code");
	}
	

}
