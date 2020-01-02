package ArraysDemo;
import java.util.Scanner;
public class twodarray {
	int a [] [] =new int [3][2];
	Scanner s=new Scanner(System.in);
	int max= a[0][0];
	public void max()
	{
		System.out.print("enter the elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
								
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				
			}
		}
		System.out.print(+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twodarray o=new twodarray();
		o.max();
	}

}
