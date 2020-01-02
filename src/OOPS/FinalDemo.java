package OOPS;

public class FinalDemo {
	final double pie;
	
double area,radius;
	public FinalDemo()
	{
		pie=3.14;// we can initialize final by making constructor also
		radius=2.44;
		
	}
	public final void acc()
	{
		//pie++;//value ant be changed once initialized
		area=pie*radius*radius;
		System.out.println(+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo oo=new FinalDemo();
		oo.acc();
		
	}

}
class Aa extends FinalDemo
{
	public void acc()//cannot override final  method
	{
		
	}
}
