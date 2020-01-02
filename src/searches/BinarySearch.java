package searches;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
	Scanner sc= new Scanner(System.in);
	int k,Lb=0,Ub,mid;
	
	public void search()
	{
		System.out.print("Enter the Size of the array");
		int n=sc.nextInt();
		Ub=n-1;
		int a[]=new int [n];
		
		System.out.print("Enter the Elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			
			System.out.print(+a[i]);
		}
		
		System.out.println("Enter the Element to be Searched");
		 k=sc.nextInt();
		
		while(Lb<=Ub)
		{
			mid=(Lb+Ub)/2;
			
			if(a[mid]==k)
			{
		System.out.println("this is the element at "+mid+" Index Value");
			break;
			}
			else if(a[mid]<k)
			{
				System.out.println(a[mid]);
				Lb=mid+1;
				System.out.println("Lb="+Lb);
			}
			else
			{
				Ub=mid-1;
			}
		
		}
		if(Lb>Ub)
		{
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch o=new BinarySearch();
		o.search();
	}+

}
