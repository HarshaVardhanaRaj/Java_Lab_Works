import java.util.*;
class Bin_Search
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		int i, n;
		
		System.out.print("How many numbers to insert?: ");
			n = in.nextInt();
		
		System.out.println("\nEnter "+n+" values in ascending order: ");
		for(i=0 ; i<n ;i++)
			arr[i] = in.nextInt();
		
		System.out.print("\nEnter a num to search: ");
		int num = in.nextInt();
		
		int low=0, high=n, mid;
		
		while(low<high)
		{
			mid = (low+high)/2;
			
			if(arr[mid]==num)
			{
				System.out.println("\nNumber Found");
				return;
			}
			
			if(arr[mid]>num)
				high = mid-1;
			
			if(arr[mid]<num)
				low = mid+1;
		}
		System.out.println("\nNumber Not Found");
	}
}
