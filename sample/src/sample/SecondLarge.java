package sample;

public class SecondLarge {
//1,45,67,89,100
	public static void main(String[] args) {
		int arr[]= {1,56,7,2,3};
	    int fir=arr[0];
	    int sec=arr[0];
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]>fir)
	    	{
	    		sec=fir;
	    		fir=arr[i];
	    		
	    	}
	    	else if(arr[i] > sec && arr[i] != fir) {
                sec = arr[i];
            }
	    }
	    System.out.println(sec);

	}

}
