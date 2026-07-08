import java.util.*;
class Area_Circle
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int r;
		
		System.out.print("Enter Radius: ");
		r = in.nextInt();
		
		System.out.println("\n");
		System.out.println("Area = "+(3.14*r*r));
	}
}	