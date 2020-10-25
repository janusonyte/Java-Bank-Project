package bankPack;
import java.io.*;
import java.io.FileWriter;
import java.util.*;


public class MainBank 
{
	static Bank bank;
	private ArrayList arr = new ArrayList();
	private String temp;
	

	
	

	public static void main(String[] args)
	{


		
		bank = bank.getInstance();
		testingBank1();
		testingBank2();

		
	}	
	
	public static void testingBank1()
	{
//		Account depo = new DepositAccount();
//		Account cred = new CreditAccount();
		
		
		//Adding customers to the Bank
//	       bank.addCustomer("Nicola Clark", "12345", 440.00, "East Kilbride", depo);
//	       bank.addCustomer("Bobby Clark", "32145", 240.00, "East Kilbride", cred);
//	       bank.addCustomer("Tommy Clark", "6543", 440.00, "Glasgow", depo);
//	       bank.addCustomer("Molly Ringwald", "7575", 140.00, "Paisley", cred); 
		
	       bank.addCustomer("Nicola Clark", "12345", 440.00, "East Kilbride", "Deposit");
	       bank.addCustomer("Bobby Clark", "32145", 240.00, "East Kilbride", "Credit");
	       bank.addCustomer("Tommy Clark", "6543", 440.00, "Glasgow", "Deposit");
	       bank.addCustomer("Molly Ringwald", "7575", 140.00, "Paisley", "Credit"); 
	       
	       

	}
	
	public static void testingBank2()
	{
		System.out.println(bank.getCustomers());
		bank.getCustomers().get(1).deposit(426);
		System.out.println(bank.getCustomers());
		bank.getCustomers().get(1).withdraw(6);
		System.out.println(bank.getCustomers());
	}
	
	
	public void readInCustomer() throws IOException
	
	{ 
		FileReader freader = new FileReader("src/bankPack/CustomerDB.txt");
		BufferedReader br = new BufferedReader(freader);
		
		while((temp = br.readLine()) != null)
		{
			arr.add(temp);
//			accNumber = temp;
		}
		System.out.println(arr);
		freader.close();
		
	}
	
	public void writeCustomer() throws IOException 
	{
		arr.add("This a new File");
		
		FileWriter writer = new FileWriter("output.txt");	    
		for(int i = 0; i<arr.size(); i++) 
		{
			String str = arr.get(i).toString();
			writer.write(str);
			if(i < arr.size()-1)//This prevent creating a blank like at the end of the file**
            writer.write("\n");
		}
			writer.close();
	}

	
	
	//test harness
//	public static void testCustomer()
//	{
//		Customer c1 = new Customer();
//		Customer c2 = new Customer("Frank Duffy","1234");
//		Customer c3 = new Customer("Robert Henderson","4321");
//		Customer c4 = new Customer("Grace Slick","7237");
//		Customer c5 = new Customer("Otis Redding","6321");
//		
//		Account a1 = new DepositAccount();
//		Account a2 = new CreditAccount();
//		
//		Customer c6 = new Customer ("Fred","3434", 450.00, "2 Sad street", a1);
//		Customer c7 = new Customer ("Diane","3224", 750.00,"6 Very Sad street", a2);
//		System.out.println("Customer name "+ c1.getName());
//		System.out.println("Customer name "+ c2.getName());
//		System.out.println("Customer name "+ c3.getName());
//		System.out.println("Customer number "+ c1.getInitialBalance ());
//		System.out.println("Account Type "+ c1.getAcc());
//		System.out.println("Account Type "+ c6.getAcc());
//		System.out.println("Account Type "+ c7.getAcc());
//		System.out.println("Customer number "+ c1.getInitialBalance ());
//	}

}//end of class
