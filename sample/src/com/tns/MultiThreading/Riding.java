package com.tns.MultiThreading;

public class Riding {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Thread t1=new Thread(v1);
		t1.start();

	}

}
