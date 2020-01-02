package Assignment;

public class pattern5 {
public void sam()
{
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	for(int m=0;m<=3;m++)
	{
		for(int n=3;n>=m;n--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern5 oo=new pattern5();
		oo.sam();

	}

}
