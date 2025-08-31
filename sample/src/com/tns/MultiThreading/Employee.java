package com.tns.MultiThreading;
//demo for multithreading
public class Employee extends Thread {
	
 public void run()
 {
	 System.out.println("HELLO");
	 System.out.println(Thread.currentThread().getId());
 }
}
 class Manager extends Thread {
	
	 public void run()
	 {
		 System.out.println("HII");
		 System.out.println(Thread.currentThread().getId());
	 }
	}
