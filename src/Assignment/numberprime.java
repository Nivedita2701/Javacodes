package Assignment;
import java.util.Scanner;

public class numberprime {
Scanner sc;
int n,temp=0;
	public void number()
	{
		System.out.println("enter the number");
		sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.print("number is prime");
		}
		else
		{
			System.out.print("number is not prime");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberprime o=new numberprime();
		o.number();
		
	}

}
