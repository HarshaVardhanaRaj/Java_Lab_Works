import java.util.*;
class Student
{
	int roll;
	String name;
	double cgpa;
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("CGPA: "+cgpa);
	}
	
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.name = "Harsha";
		s1.roll = 22;
		s1.cgpa = 9.35;
		s1.display();
	}
}