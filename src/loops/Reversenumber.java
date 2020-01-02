package loops;
import java.util.Scanner;

public class Reversenumber {
	int rem,rev=0,no;
	Scanner s=new Scanner(System.in);
	
	
	public void rev()
	{
		System.out.println("Enter the Number");
		no=s.nextInt();
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(+rev);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversenumber o=new Reversenumber();
		o.rev();
		
	}

}
