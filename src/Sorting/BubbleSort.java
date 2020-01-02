package Sorting;
import java.util.Scanner;

public class BubbleSort {
	Scanner s=new Scanner(System.in);
	int n,temp,i,j;
	
	public void sort()
	{
		System.out.println("enter the size of array");
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort oo=new BubbleSort();
		oo.sort();
	}

}
