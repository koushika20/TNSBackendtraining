package com.tns.interfaces;

public interface Laptop {
	//interface is a blueprint which is a collection of abstract methods and variables where
	//you only declare abstract methods but dont provide any implementation
	void cut();
	void copy();
	void paste();
	default void security()
	{
		printing();
		System.out.println("default securuity code");
	}
	static void printing()
	{
		System.out.println("Hello");
	}

}
