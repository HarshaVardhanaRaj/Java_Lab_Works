import java.util.*;
class Students
{
	Scanner in = new Scanner(System.in);
	int roll;
	String name;
	double cgpa;
	
	void get()
	{
		System.out.print("Enter the Name of the Student: ");
		name = in.nextLine();
		System.out.print("Enter the Roll of the Student: ");
		roll = in.nextInt();
		System.out.print("Enter the CGPA of the Student: ");
		cgpa = in.nextDouble();
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("CGPA: "+cgpa);
	}
	
	
	public static void main(String args[])
	{
		Students s1 = new Students();
		Students s2 = new Students();
		
		s1.get();
		s1.display();
		s2.get();
		s2.display();
	}
}