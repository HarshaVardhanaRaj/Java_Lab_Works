import java.util.*;
class ASCII
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = in.next().charAt(0);
		
		System.out.println("\nThe ASCII value of "+ch+" = "+(int)ch);
	}
}