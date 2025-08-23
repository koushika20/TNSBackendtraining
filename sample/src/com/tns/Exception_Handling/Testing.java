package com.tns.Exception_Handling;
//Demo for try,catch,finally blocks
public class Testing {
	public static void main(String[]args)
	{
	try
	{
		int ans=10/2;
		System.out.println(ans);
		int arr[]=new int[4];
		arr[5]=10;
		System.out.print(arr[5]);
	}
	catch(ArithmeticException  e)
	{
		System.err.println("It produces exception when something goes wrong");
		
	}
	catch(ArrayIndexOutOfBoundsException er)
	{
		System.err.println("You tried to print input that is not bounded");
	}
	finally
	{
		System.out.println("Exception is handled");
	}
	}

}
