package Assignment;

public class Pattern3 {
	public void triangle()
	{
		for(int i=0;i<=4;i++)
		if(i!=1)	{
	{
		for(int j=0;j<=i;j++)
		{
		System.out.print(" ");
		}	
	for(int k=3;k>=i;k--) 
	{
		 System.out.print(" *");
	}
	System.out.println();
	}
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern3 o=new Pattern3();
o.triangle();

	}

}
