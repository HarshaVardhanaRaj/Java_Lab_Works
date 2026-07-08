import java.util.*;
class Celsius_Fahrenheit
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int c;
		
		System.out.print("Enter Temp in Celsius: ");
		c = in.nextInt();
		
		System.out.println("\n");
		System.out.println("Temp in Fahrenheit = "+(c*1.8+32));
	}
}	