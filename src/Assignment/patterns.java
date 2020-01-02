package Assignment;

public class patterns {
public void star()
{
	for(int i=0;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
		System.out.print(" ");
		}	
	for(int k=0;k<=i;k++) 
	{
		 System.out.print("*");
	}
	System.out.println();

}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
patterns o=new patterns();
o.star();

	}

}
