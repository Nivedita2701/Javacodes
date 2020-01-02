package searches;
import java.util.Scanner;

public class linearsearch {
	Scanner sc=new Scanner (System.in);
	int temp=0;
	
	public void search()
	{
		System.out.print("Enter the Size of the array");
		int n=sc.nextInt();
		int a[]=new int [n];
		
		System.out.print("Enter the Elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the Element to be Searched");
		int k=sc.nextInt();
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
	System.out.println("This is the Element "+i+" index position");
				temp=temp+1;
			}
				
		}
	if(temp==0)
	{
		System.out.println("Item not found");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linearsearch oo=new linearsearch();
		oo.search();
		
	}

}
