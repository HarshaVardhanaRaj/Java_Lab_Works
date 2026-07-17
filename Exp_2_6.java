class Bank
{
	private String accHolderName;
	private long accNo;
	private double accBal;	
	
	void set(String accHolderName, long accNo, double accBal)
	{
		this.accHolderName = accHolderName;
		this.accNo = accNo;
		this.accBal = accBal;
		System.out.println("Account Set Successfully");
	}
	
	void setBalance(double accBal)
	{
		this.accBal = accBal;
		System.out.println("New Balance Set Successfully");
	}
	
	void get()
	{
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Account No: "+accNo);
		System.out.println("Account Balance: "+accBal);
	}
}

class Exp_2_6
{
	public static void main(String args[])
	{
		Bank c1 = new Bank();
		c1.set("Niga Tron",6767,7809.67);
		c1.get();
		c1.setBalance(10809.67);
		c1.get();
	}
}