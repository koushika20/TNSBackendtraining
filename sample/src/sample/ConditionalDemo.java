package sample;
import java.util.Scanner;
public class ConditionalDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.print(age+" is valid right to vote");		
		}
		else
		{
			System.out.println("CANNOT VOTE");
		}
		

	}

}
