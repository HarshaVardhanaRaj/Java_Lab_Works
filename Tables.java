import java.util.*;
class Tables
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, m, n;
		
		System.out.print("Enter the required table's num: ");
		n = in.nextInt();
	
		System.out.print("How many multiples?: ");
		m = in.nextInt();
	
		System.out.println("Enter "+n+" numbers: ");
		for(i=1 ; i<=m ; i++)
			System.out.println(n+" * "+i+" = "+(n*i));
	}
}