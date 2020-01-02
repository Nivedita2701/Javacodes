package Assignment;

public class Pattern2 {

	public void star()
	{
		for(int i=0;i<=2;i++)
		{
			for(int j=2;j>=i;j--) 
		{
			     System.out.print(" ");
		}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 oo=new Pattern2();
		oo.star();
		
	}

}
