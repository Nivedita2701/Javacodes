package ArraysDemo;
import java.util.Scanner;
public class maxelement {
int [] a = new int [10];
int max=a[0];
int size;
Scanner s=new Scanner(System.in);
	public void max()
	{
		System.out.println("enter size of array");
		size=s.nextInt();
		a=new int[size];
	System.out.print("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print(+max);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxelement oo=new maxelement();
		oo.max();
				
	}

}
