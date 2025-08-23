package com.tns.abstraction;

public abstract class SampleAc implements Laptop1 {
	
	public void cut() {
		System.out.println("Lenovo cut code");
		
	}

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");
		
	}
	public abstract void paste();
}
