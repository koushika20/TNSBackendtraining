package sample;

public class SecondLarge {

	public static void main(String[] args) {
		int arr[]= {1,45,67,89,100};
	    int fir=arr[0];
	    int sec=arr[0];
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]>fir)
	    	{
	    		sec=fir;
	    		fir=arr[i];
	    		
	    	}
	    }
	    System.out.println(sec);

	}

}
