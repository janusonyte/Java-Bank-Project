package bankPack;

public class Customer 
{
	private String name;

	private double initialBalance;
	private String address;
	private int custID;
	private Account acc;
	
	public Customer() 
	{
		this.initialBalance = 0.0;
	}
	
	public Customer(int custID, String name, String accountNumber, double balance, String address, String typeOfAccount) 
	{
		this.custID = custID;
		this.name = name;
//		this.accountNumber = accountNumber;
//		this.balance = balance;
		this.address = address;
//		this.acc = acc;
		if (typeOfAccount == "Deposit") 
		{
			this.acc = new DepositAccount(accountNumber, balance);
		}
		else if (typeOfAccount == "Credit") 
		{
			this.acc = new CreditAccount(accountNumber, balance);
		}
		
		
	}
	
	public void deposit(double amount)
	{
		acc.depositCash(amount);
		
	}
	
	public void withdraw(double amount)
	{
		acc.withdrawCash(amount);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getInitialBalance() 
	{
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) 
	{
		this.initialBalance = initialBalance;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAccountNumber() 
	{
		return acc.getAccountNumber();
	}

	public Account getAcc() 
	{
		return acc;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name  + ", address=" + address + ", custID="
				+ custID + ", acc=" + acc + ", getName()=" + getName() + 
				", getAddress()=" + getAddress() + ", getAccountNumber()=" + getAccountNumber() + ", getAcc()="
				+ getAcc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
	
	
	
	

}//end of class
