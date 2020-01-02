package Assignment;

public class patterndiamond {

	public void sam()
	{
		for(int i=0;i<=2;i++)
		{
			for(int j=1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=0;m<=1;m++)
		{
			for(int n=0;n<=m;n++)
			{
				System.out.print(" ");
			}
				for(int p=1;p>=m;p--)
				{
					System.out.print("*");
			}
				for(int f=0;f>=m;f--)
				{
					System.out.print("*");
				
				}
			
				System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patterndiamond oo=new patterndiamond();
				oo.sam();
	}

}
