package sample;

public class SortArray2 {

	public static void main(String[] args) {
		int arr[]= {5,2,8,7,1};
		int n=arr.length;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int ar:arr)
		{
			System.out.println(ar);
		}
	}

}
