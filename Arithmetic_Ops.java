import java.util.*;
class Arithmetic_Ops
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Enter 1st num: ");
		a = in.nextInt();
		System.out.print("Enter 2nd num: ");
		b = in.nextInt();
		
		System.out.println("\n\n\n");
		
		System.out.println("Sum = "+(a+b));
		System.out.println("Difference = "+(a-b));
		System.out.println("Product = "+(a*b));
		System.out.println("Quotient = "+(a/b));
		System.out.println("Remainder = "+(a%b));
	}
}	