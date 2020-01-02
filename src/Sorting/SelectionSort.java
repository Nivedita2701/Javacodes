package Sorting;
import java.util.Scanner;

public class SelectionSort {
	Scanner sc=new Scanner (System.in);
	int size,a,i,j,temp,min;
	public void sort()
	{

		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int a[]=new int[size];
			
		System.out.println("Enter the elements of array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			min=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort oo=new SelectionSort();
		oo.sort();
	}

}
