package Assignment;
import java.util.Scanner;

public class ArmstrongNumber {
	Scanner sc=new Scanner(System.in);
	int no;
	int z,rem,length,sum=0;
	public void arm()
	{
		System.out.println("enter the number");
		no=sc.nextInt();
		z=no;
		while(z!=0)
		{
			z=z/10;
			length=length+1;
		}
			//System.out.println(length);
			int s=1;
			z=no;
		while(z!=0)
		{
			rem=z%10;
			
			for(int i=0;i<length;i++) 
			{
				s=s*rem;
			
			}
			sum=sum+s;
			s=1;
			z=z/10;
		
		}
		/*while(t2!=0)
		{
			
			rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}*/
		//System.out.println(+s);
		
		if(no==sum)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber o=new ArmstrongNumber();
		o.arm();
	}

}
