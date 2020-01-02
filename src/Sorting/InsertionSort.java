package Sorting;
import java.util.Scanner;

public class InsertionSort {
	Scanner s=new Scanner (System.in);
	int n,temp;
	
	public void Insert()
	{
		System.out.println("enter the size of the array");
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.print("enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			while(i>0 && a[i-1]>temp)
			{
				a[i]=a[i-1];
				i=i-1;
			}
			a[i]=temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort oo=new InsertionSort();
		oo.Insert();
		}

}
