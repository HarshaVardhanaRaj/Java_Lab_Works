class Employee
{
	private String empName;
	private int empID;
	private double empSal;
	
	Employee()
	{
		empName = "ABC";
		empID = 100;
		empSal = 8000.00;
		System.out.println("Variables Initialised Successfully");
	}
	
	void set(String empName, int empID, double empSal)
	{
		this.empName = empName;
		this.empID = empID;
		this.empSal = empSal;
		System.out.println("Variables Modified Successfully");
	}
	
	void get()
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee No: "+empID);
		System.out.println("Employee Salary: "+empSal);
	}
}

class Exp_2_8
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.get();
		e1.set("Wukong",101,125000.00);
		e1.get();
	}
}