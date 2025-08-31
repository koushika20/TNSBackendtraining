package com.tns.MultiThreading;
//demo for multithreading
public class Employee extends Thread {
	
 public void run()
 {
	 System.out.println("HELLO");
	// System.out.println(Thread.currentThread().getId());
	 for(int i=0;i<6;i++)
	 {
		 System.out.println(i);
	 }
 }
 public Employee(String ename)
 {
	 super(ename);
 }
}
 class Manager extends Thread {
	
	 public void run()
	 {
		 System.out.println("HII");
		 //System.out.println(Thread.currentThread().getId());
		 for(int i=10;i<16;i++)
		 {
			 System.out.println(i);
		 }
	 }
	}
