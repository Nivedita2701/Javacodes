package Assignment;
import java.util.Scanner;
public class PrimeNumber {
int n,temp=0;
public void acc()
{
System.out.println("enter the value");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for( int i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
		temp=temp+1;
}
}
	if(temp>0)
	{
		System.out.println("not prime");
	}
	else {
		System.out.println("prime");
	}
}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
PrimeNumber oo=new PrimeNumber();
oo.acc();

	}

}
