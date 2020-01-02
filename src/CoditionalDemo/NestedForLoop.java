package CoditionalDemo;

public class NestedForLoop {
public void star()
{
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NestedForLoop o=new NestedForLoop();
o.star();

	}
}
