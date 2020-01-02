package Sorting;

import java.util.Scanner;

public class InsertinganElement {
	Scanner sc=new Scanner (System.in);
	int size,k,I,i;
	
	public void Insert()
	{
	System.out.println("Enter the size of the array");
	size=sc.nextInt();
	int a[]=new int[size];
		
	System.out.println("Enter the elements of array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the value to be inserted");
	k=sc.nextInt();
	
	System.out.println("Enter the index at which you want to insert the value");
	I=sc.nextInt();
	
	for(int i=a.length-1;i>=I-1;i--)
	{
		a[i]=a[i-1];
			
	}
	a[I-1]=k;
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i]);
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertinganElement oo=new InsertinganElement();
		oo.Insert();
	}

}
