package sample;


import java.util.Arrays;
import java.util.Scanner;
	public class SortArray {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Koushika");
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			sc.close();
		}

	}



