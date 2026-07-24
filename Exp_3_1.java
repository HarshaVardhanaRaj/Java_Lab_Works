class Employee
{
	int empID;
	String empName;
}

class Manager extends Employee
{
	double salary;
	void display()
	{
		System.out.println("ID: "+empID);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
	}
}

class Exp_3_1
{
	public static void main(String args[])
	{
		Manager m1 = new Manager();
		m1.empID = 101;
		m1.empName = "HVR";
		m1.salary = 150000.00;
		m1.display();
	}
}