import java.util.*;
class Student_Details
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		String name, dept;
		int regno;
		double cgpa;
		
		System.out.print("Enter the Name: ");
		name = in.nextLine();
		
		System.out.print("Enter the Reg.No: ");
		regno = in.nextInt();
		
		System.out.print("Enter the Department: ");
		dept = in.nextLine();
		
		System.out.print("Enter the CGPA: ");
		cgpa = in.nextDouble();
		
		System.out.println("\n\n\n");
		
		System.out.println("Student Name: "+name);
		System.out.println("Register Number: "+regno);
		System.out.println("Department: "+dept);
		System.out.println("CGPA: "+cgpa);
	}
}	