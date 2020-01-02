package Assignment;
import java.util.Scanner;
public class FibonaciSeries {
int a,sum,t1=0,t2=1;
Scanner sc;
public void fib()
{
	System.out.println("enter the limit");
	sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.print(t1+"+"+t2);
	for(int i=1;i<=a;i++)
	{
		int sum=t1+t2;
		System.out.print("+"+sum);
		t1=t2;
		t2=sum;
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonaciSeries o=new FibonaciSeries();
		o.fib();
		
	}

}
