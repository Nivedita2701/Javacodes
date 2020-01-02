package ArraysDemo;
import java.util.Scanner;

public class twodprintelements {
	int a [][]=new int [3][2];
	Scanner s=new Scanner (System.in);	
	
	public void elements()
	{
		System.out.print("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
				
			}
			
	}
		System.out.println("elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			 System.out.print(a[i][j]);
		}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twodprintelements o=new twodprintelements();
		o.elements();
		
	}

}
