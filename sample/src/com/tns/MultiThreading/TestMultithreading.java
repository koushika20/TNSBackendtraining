package com.tns.MultiThreading;
//<Multi threading using lambda expressions
//demo for showing disadvantage of multithreading
public class TestMultithreading {

	public static void main(String[] args) throws Exception {
		BrickDairy bd=new BrickDairy();
		Runnable r1 = () -> {
		  for(int i=0;i<10000;i+=50)
		  {
			  bd.IncrementBrickcount();
		  }
		};
		Runnable r2 = () -> {
			  for(int i=0;i<15000;i+=50)
			  {
				  bd.IncrementBrickcount();
			  }
			};
		Runnable r3 = () -> {
				  for(int i=0;i<5000;i+=50)
				  {
					  bd.IncrementBrickcount();
				  }
			};
			
			Thread t1=new Thread(r1);
			Thread t2=new Thread(r2);
			Thread t3=new Thread(r3);
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t2.join();
			t3.join();
			System.out.println(bd.Brickcount);
		
	}

}
class BrickDairy
{
	int Brickcount=0;
	public synchronized void IncrementBrickcount()
	{
		Brickcount+=50;
	}
}
