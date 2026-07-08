import java.util.*;
class Sum_of_N
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, count, s=0;
		
		System.out.print("How many nums?: ");
		count = in.nextInt();
		
		int arr[] = new int[10];
		
		System.out.println("Enter "+count+" numbers: ");
		for(i=0 ; i<count ; i++)
		{
			arr[i] = in.nextInt();
			s+=arr[i];
		}
		
		System.out.println("\nThe sum = "+s);
	}
}