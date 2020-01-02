package Assignment;
import java.util.Scanner;
public class seriesprimenumber {
Scanner sc;
int temp=0;
public void pn()
{
	for(int i=0;i<=100;i++)
	{
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(i);
		}
		else
		{
			temp=0;
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seriesprimenumber o=new seriesprimenumber();
		o.pn();
	}

}
