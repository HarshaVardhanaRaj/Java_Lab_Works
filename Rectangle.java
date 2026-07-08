import java.util.*;
class Rectangle
{
	double l,b;
	
	void display_Area()
	{
		System.out.println("Area = "+(l*b));
	}
	
	double calc_Area()
	{
		return(l*b);
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		
		System.out.print("Enter the length: ");
		r1.l = in.nextDouble();
		System.out.print("Enter the breadth: ");
		r1.b = in.nextDouble();
		
		r1.display_Area();
		double ar = r1.calc_Area();
		
		System.out.println("Returned Area = "+ar);
	}
}		