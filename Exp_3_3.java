class Student
{
	int rollno;
	String studName;
	
	Student(int rollno, String studName)
	{
		this.rollno = rollno;
		this.studName = studName;
	}
}

class Result extends Student
{
	int p, c, m;
	double avg, total;
	
	Result(int rollno, String studName, int p, int c, int m)
	{
		super(rollno, studName);
		this.p = p;
		this.c = c;
		this.m = m;
	}
	
	void calc()
	{
		total = p+c+m;
		avg = total/3;
	}
	
	void display()
	{
		System.out.println("Roll.No: "+rollno);
		System.out.println("Name: "+studName);
		System.out.println("Total Marks: "+total);
		System.out.println("Avg Marks: "+avg);
	}
}

class Exp_3_3
{
	public static void main(String args[])
	{
		Result s1 = new Result(101,"Harsha",94,91,95);
		Result s2 = new Result(102,"Tyson",84,81,85);
		s1.calc();
		s2.calc();
		s1.display();
		s2.display();
	}
}