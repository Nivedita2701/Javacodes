package Assignment;

public class Pattern4 {
public void diamond()
{
	for(int i=0;i<=2;i++) {

	for(int j=2;j>=i;j--)
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
	
		for(int m=1;m<=2;m++)
		{
				
			for(int n=0;n<=m;n++)
			{
				System.out.print(" ");
				}
			for(int f=2;f>=m;f--)
			{
				System.out.print("*");
			}
			for(int h=1;h>=m;h--)
			{
				System.out.print("*");
			}
			System.out.println();
			}
		}
		
	public static void main(String[] args) {

Pattern4 o=new Pattern4();
o.diamond();

	}

}
