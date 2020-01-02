package Assignment;

public class sample {
public  void sam()
{
	for(int i=0;i<=3;i++)
	{
		if(i!=1) {
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
		sample oo=new sample();
		oo.sam();
	}

}
