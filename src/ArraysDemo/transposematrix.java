package ArraysDemo;
import java.util.Scanner;

public class transposematrix {
	int a [][]=new int [3][3];
	Scanner s=new Scanner (System.in);
	
	public void transpose()
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
				 System.out.print(a[j][i]);
			}
				System.out.println();
			}
			
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transposematrix o=new transposematrix();
		o.transpose();
	
	}

}
