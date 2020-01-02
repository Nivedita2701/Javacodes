package exception;
import java.util.Scanner;
public class BankAtm 
{
int atmID,balance=50000;
double rembal,amt;
String bankname,location;
Scanner sc=new Scanner(System.in);
public void acc()
{
	System.out.println("Enter your AtmId:");
	atmID=sc.nextInt();
	System.out.println("Enter your Bank Name:");
	bankname=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the location of the bank:");
	location=sc.nextLine();
	sc.nextLine();
	System.out.println("enter the amount to be withdrawn");
	amt=sc.nextDouble();
	
	}
public void withdraw()
{
	System.out.println("Your balance is "+balance);
	rembal=balance-amt;
	System.out.println("your remaining balance is:"+rembal);
	

	if(amt>balance)
	{
		System.out.println("amount to be deducted  is more  than the balance");
		
	}
	else if(rembal<10000)
	{
		try
		{
			throw new BankAtmException();
			
		}
catch(BankAtmException e)
		{
	System.out.println(" withdraw is not allowe as remaning balnce is less then 10000");
		}
		
		
	}
	
	}

	public static void main(String[] args) {
		 BankAtm obj=new BankAtm();
		   obj.acc();
	
		   obj.withdraw();

	}

}
