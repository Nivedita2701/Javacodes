package Assignment;
import java.util.Scanner;
public class Factorial {
	int n,i,z=1;
	Scanner sc;	
	public void fact()
	{
		System.out.println("enter the number");
		sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			z=z*i;	
		}
		System.out.println(+z);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial o=new Factorial();
		o.fact();
		

	}

}
