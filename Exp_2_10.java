class Employee
{
	private String empName;
	private int empID;
	private double empSal;
	
	/*default constructor
	Employee()
	{
		empName = "";
		empID = 0;
		empSal = 0.0;
	}
	*/
	
	Employee(int empID)
	{
		this.empID = empID;
	}
	
	Employee(String empName, double empSal)
	{
		this.empName = empName;
		this.empSal = empSal;
	}
	
	void display()
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee No: "+empID);
		System.out.println("Employee Salary: "+empSal);
	}
}

class Exp_2_10
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.display();
		Employee e2 = new Employee(101);
		e1.display();
		Employee e3 = new Employee("Alien",98700.00);
		e1.display();		
	}
}