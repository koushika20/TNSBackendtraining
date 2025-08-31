package com.tns.MultiThreading;

public class Threading {

	public static void main(String[] args) {
	       Employee e1=new Employee("koushika");
	      
	       Manager m1=new Manager();
	       m1.start();
	       e1.start();
	       
	       

	}

}
