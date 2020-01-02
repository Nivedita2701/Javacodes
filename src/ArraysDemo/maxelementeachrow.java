package ArraysDemo;
import java.util.Scanner;

public class maxelementeachrow {
int a[][]=new int[4][3];
Scanner s=new Scanner(System.in);
int max=a[0][0];

	public void row()
	{
		System.out.print("enter the elements");
		
		for(int i=0;i<a.length;i++)
		{ int max= a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
				if(a[i][j]>max)
				{
					max=a[i][j];
					a[i][j]=max;
				}
			
			}
			System.out.print(+max);
						
			}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxelementeachrow o=new maxelementeachrow();
		o.row();
		
	}

}
