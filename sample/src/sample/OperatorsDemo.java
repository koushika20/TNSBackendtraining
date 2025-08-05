package sample;

public class OperatorsDemo {

	public static void main(String[] args) {
		System.out.println(4 & 5);  //
		System.out.println(4 | 5);
		/*
		int a=5;
		int b=a++; //post increment will increment first and assigned later in next iteration
		
		int c=6;
		int d=++c; //pre increment will increment and assigned to a variable 
		System.out.println(b);
		System.out.println(d);
		int e=5;
		e++;
		System.out.println(e);
		*/
		int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
		
        int d=6;
       
        System.out.println(d--);
        int f=2;
        
        System.out.println("f &= 0b1010: " + (f&= 0b1010));

	}

}
