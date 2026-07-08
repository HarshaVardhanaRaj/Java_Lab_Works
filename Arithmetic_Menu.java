import java.util.*;
class Arithmetic_Menu
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int a,b,ch;
		
		System.out.print("Enter 1st num: ");
		a = in.nextInt();
		System.out.print("Enter 2nd num: ");
		b = in.nextInt();
		
		System.out.print("\n\nEnter 1 = Add \nEnter 2 = Subtract \nEnter 3 = Multiply \nEnter 4 = Divide \nEnter 5 = Modulus\n\n");		
		System.out.print("Enter choice of operation:");
		ch = in.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("Sum = "+(a+b));
				break;
			
			case 2:
				System.out.println("Difference = "+(a-b));
				break;
				
			case 3:
				System.out.println("Product = "+(a*b));
				break;
				
			case 4:
				System.out.println("Quotient = "+(a/b));
				break;
				
			case 5:
				System.out.println("Remainder = "+(a%b));
				break;
				
			default:
				System.out.println("Invalid Choice");
		}
	}
}	