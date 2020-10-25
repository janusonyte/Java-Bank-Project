package bankPack;

public class DepositAccount extends Account
{
	double interestRate;
	
	public DepositAccount()
	{
		super();
		interestRate = 2.5;
	}
	
	public DepositAccount(String accountNumber, double balance)
	{
		super(accountNumber, balance);
		interestRate = 2.5;
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
	
	public void overdraft()
	{
		double overdraft = 500;
		//enter code here
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
			System.out.println("You do not have enough money in your deposit account to complete this transaction.");
		}
	}
	
	public void depositCash(double amount)
	{
		//enter code here
		balance = balance + amount;
		System.out.println("You have deposited " + amount + " . Your new balance is " + balance);
		
	}

	@Override
	public String toString() {
		return "DepositAccount [interestRate=" + interestRate + ", balance=" + balance + ", getInterestRate()="
				+ getInterestRate() + ", getCustomers()=" + getCustomers() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}//end of class
