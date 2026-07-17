class Employee
{
	private String empName;
	private int empNo;
	private double empSal;
	
	void set(String empName, int empNo, double empSal)
	{
		this.empName = empName;
		this.empNo = empNo;
		this.empSal = empSal;
	}
	
	void get()
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee No: "+empNo);
		System.out.println("Employee Salary: "+empSal);
	}
}

class Exp_2_5
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.set("Wukong",101,125000.00);
		e1.get();
	}
}