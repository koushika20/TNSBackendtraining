package sample;

public class MinMax {

	public static void main(String[] args) {
		
	     int arr[]= {10,43,55,67,19};
	     int max=arr[0];
	     int min=arr[0];
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i]>max)
	    	 {
	    		 max=arr[i];
	    	 }
	    	 else if(arr[i]<min)
	    	 {
	    		 min=arr[i];
	    	 }
	     }
	     System.out.println(max);
	     System.out.println(min);

	}

}
