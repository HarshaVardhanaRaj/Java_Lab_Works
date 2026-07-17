class Student
{
	private String studName;
	private int studRollNo;
	private String studDept;
	
	Student()
	{
		this.studName = "ABC";
		this.studRollNo = 100;
		this.studDept = "XYZ";
		System.out.println("Class Variables Initialised Successfully");
	}
	
	Student(String studName)
	{
		this.studName = studName;
		System.out.println("Student Name Updated Successfully");
	}
	
	Student(String studName, int studRollNo, String studDept)
	{
		this.studName = studName;
		this.studRollNo = studRollNo;
		this.studDept = studDept;
		System.out.println("Class Variables Updated Successfully");
	}
	
	void display()
	{
		System.out.println("Student Name: "+studName);
		System.out.println("Student Roll.no: "+studRollNo);
		System.out.println("Student Department: "+studDept);
	}
}

class Exp_2_9
{
	public static void main(String args[])
	{
		Student s1 = new Student("Harsha",22,"AI&DS");
		s1.display();
	}
}