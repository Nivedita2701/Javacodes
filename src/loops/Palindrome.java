package loops;
import java.util.Scanner;

public class Palindrome {
	int rem,rev=0,no;
	
	Scanner sc=new Scanner (System.in);
	
	public void samno()
	{
		System.out.println("Enter the Number");
		no=sc.nextInt();
		int temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(+rev);

		if(no==rev)
		{
			System.out.print("Number is palindrome");
		}
		else
		{
			System.out.print("Not palindrome");
			
		}
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome oo=new Palindrome();
		oo.samno();
	}

}
