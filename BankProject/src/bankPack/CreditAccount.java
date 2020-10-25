package bankPack;

public class CreditAccount extends Account
{
	private double interestRate;
	

	public CreditAccount()
	{
		super();
		interestRate = 3.4;
	}
	
	public CreditAccount(String accountNumber, double balance)
	{
		super(accountNumber, balance);
		interestRate = 3.4;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void displayBalance()
	{
		balance = balance + ((balance * interestRate)/100);
		System.out.println(balance);
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void overdraft()
	{
//		boolean isOverdrawn = false; 
//		double overdraft = 1000;
//		if(balance < 0)
//		{
//			isOverdrawn = true;
//			balance = overdraft;
//		}
		
	}
	
	public void withdrawCash(double amount)
	{
		if (amount <= balance)
		{
			System.out.println("Your withdrawal request has been approved.");
			balance = balance - amount;
			System.out.println("Your remaining balance is " + balance);
		}
		else
		{
			System.out.println("You do not have enough money in your credit account to complete this transaction.");
		}
	}
	
	public void depositCash(double amount)
	{
		//enter code here
		balance = balance + amount;
		System.out.println("You have deposited " + amount + " . Your new balance is " + balance);
		
	}

	@Override
	public String toString() 
	{
		return "CreditAccount [interestRate=" + interestRate + ", balance=" + balance + ", getCustomers()="
				+ getCustomers() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
	
}//end of class
