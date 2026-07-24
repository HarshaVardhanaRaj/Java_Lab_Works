class Account
{
	protected int accNo;
	protected double balance;
	
	Account(int accNo, double balance)
	{
		this.accNo = accNo;
		this.balance = balance;
	}
	
	void display()
	{
		System.out.println("Welcome Acc.No: "+accNo);
	}
}

class SavingsAccount extends Account
{
	
	SavingsAccount(int accNo, double balance)
	{
		super(accNo, balance);
	}
	
	void dep(int amt)
	{
		balance+=amt;
		System.out.println("Rs. "+amt+" deposited.");
	}
	
	void wtd(int amt)
	{
		System.out.print("Withdrawl Request for Rs. "+amt);
		if(balance<amt)
			System.out.println(" Denied due to Insufficient Balance.");
		else
		{
			balance-=amt;
			System.out.println(" Granted.");
		}
	}
	
	void chkBal()
	{
		System.out.println("Balance: "+balance);
	}
	
	void display()
	{
		super.display();
	}
}

class Exp_3_4
{
	public static void main(String args[])
	{
		SavingsAccount a1 = new SavingsAccount(5885,12345.60);
		a1.display();
		a1.wtd(1000);
		a1.chkBal();
		a1.wtd(12000);
		a1.dep(20000);
		a1.wtd(12000);
		a1.chkBal();
	}
}