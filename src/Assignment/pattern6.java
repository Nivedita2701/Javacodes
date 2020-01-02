package Assignment;

public class pattern6 {
public void mad()
{
	for(int i=0;i<=4;i++)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	
	for(int m=0;m<=3;m++)
	{
		for(int n=0;n<=m;n++)
		{
			System.out.print(" ");
		}
		for(int p=3;p>=m;p--)
		{
			System.out.print("*");
			}
	
	System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern6 oo=new pattern6();
		oo.mad();
	}

}
