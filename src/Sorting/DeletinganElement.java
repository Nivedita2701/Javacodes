package Sorting;
import java.util.Scanner;
	
public class DeletinganElement {

	Scanner sc=new Scanner (System.in);
	int size,k,I,i,count=0;
	
	public void del()
	{
	System.out.println("Enter the size of the array");
	size=sc.nextInt();
	int a[]=new int[size];
		
	System.out.println("Enter the elements of array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the value to be deleted");
	k=sc.nextInt();
	
	
	for(i=0;i<a.length;i++)
	{
		if(a[i]==k)
		{
			for(int j=i;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			count=count+1;
			break;
		}
	}
	if(count==0)
	{
		System.out.println("element not present");
	}
	else
	{
		System.out.println("element deleted succesfully");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeletinganElement oo=new DeletinganElement();
		oo.del();
	}

}
