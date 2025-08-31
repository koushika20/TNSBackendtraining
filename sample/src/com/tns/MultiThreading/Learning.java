package com.tns.MultiThreading;

public class Learning {

	public static  void main(String[] args) {
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println(i);
				}
			}
			
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				for(int i=10;i<15;i++)
				{
					System.out.println(i);
				}
			}
			
		};
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		System.out.println(t1.getState());
	}

}
