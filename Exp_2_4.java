class Student
{
	private String studName;
	private int studRegno;
	private double studCGPA;
	
	void set(String studName, int studRegno, double studCGPA)
	{
		this.studName = studName;
		this.studRegno = studRegno;
		this.studCGPA = studCGPA;
	}
	
	void get()
	{
		System.out.println("Student Name: "+studName);
		System.out.println("Student Reg.no: "+studRegno);
		System.out.println("Student CGPA: "+studCGPA);
	}
}

class Exp_2_4
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.set("Harsha",22,9.71);
		s1.get();
		
	}
}