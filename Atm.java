import java.util.*;

public class Atm
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter your Name & Customer ID: 	");
	String name=s.nextLine();
	String customerId=s.nextLine();
	BankAccount obj=new BankAccount(name, customerId);
	obj.menu();
	}
}

class BankAccount
{
	double bal;
	double prevTrans;
	String customerName;
	String customerId;
	
	BankAccount(String customerName, String customerId)
	{
	this.customerName=customerName;
	this.customerId=customerId;
	}

	void deposit(double amount)
	{
		if(amount!=0)
		{
		bal+=amount;
		prevTrans=amount;
		}
	}

	void withdraw(double amt)
	{
		if(amt!=0 && bal>=amt)
		{
		bal-=amt;
		prevTrans=-amt;
		}
	
		else if(bal<amt)
		{
		System.out.println("Bank balance insufficient");
		}
	}

	void getPreviousTrans()
	{
		if(prevTrans>0)
		{
		System.out.println("Deposited: "+prevTrans);
		}
		else if(prevTrans<0)
		{
		System.out.println("Withdrawn: "+Math.abs(prevTrans));
		}
		else
		{
		System.out.println("No Transactions Occured");
		}
	}

	void menu()
	{
	int option;
	Scanner s=new Scanner(System.in);
	System.out.println("Welcome "+customerName);
	System.out.println("Your ID: "+customerId);
	System.out.println("\n");
	

	do
	{
		System.out.println("--------------------------------------");
		System.out.println("Choose An Option \n 1. Check Balance  \n 2. Deposit Amount \n 3. Withdraw Amount \n 4. Previous Transaction \n 5. Exit");
		option=s.nextInt();	
		System.out.println("\n");

		switch(option)
		{
		case 1:
			System.out.println("..................................");
			System.out.println("Balance ="+bal);
			System.out.println("..................................");
			System.out.println("\n");
			break;
		
		case 2:
			System.out.println("..................................");
			System.out.println("Enter Amount To Deposit: ");
			System.out.println("..................................");
			double amt=s.nextDouble();
			deposit(amt);
			System.out.println("You Have Deposited The Sum : "+amt);
			System.out.println("\n");
			break;

		case 3:
			System.out.println("..................................");
			System.out.println("Enter Amount To Withdraw: ");
			System.out.println("..................................");
			double amtw=s.nextDouble();
			withdraw(amtw);
			System.out.println("\n");
			System.out.println("Your Current Balance ="+bal);
			System.out.println("\n");
			break;

		case 4:
			System.out.println("..................................");
			System.out.println("Previous Transaction: ");
			getPreviousTrans();
			System.out.println("..................................");
			System.out.println("\n");
			break;

		case 5:
			System.out.println("..................................");
			break;
			
		default:
			System.out.println("Choose Correct Option");
			break;
		}
	}

	while(option!=5);
	System.out.println("Thank You For Using Our Services Have A Good Day");
}
}