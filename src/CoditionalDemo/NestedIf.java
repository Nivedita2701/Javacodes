package CoditionalDemo;

public class NestedIf {
int num1=10,num2=20,num3=30;
public void CheckGreater()
{
	if(num1>num2)
	{
		if(num1>num3)
		{
			System.out.println("num1 is greatest:"+num1);
		}
		
	}
	else if((num2>num1)&& (num2>num3))

		{
			System.out.println("num2 is greatest:"+num2);
		}
	
	else
	{
		System.out.println("num3 is the greatest:"+num3);
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedIf oo=new NestedIf();
		oo.CheckGreater();
	}

}
