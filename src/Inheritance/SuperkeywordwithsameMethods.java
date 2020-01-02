package Inheritance;


class one
{
	void show()
	{
		System.out.println("this is first class");
	}
}
class two extends one
{
	void show()
	{
	super.show();
	System.out.println("this is second class");	
	}
	
}
public class SuperkeywordwithsameMethods {

	public static void main(String[] args) {
		two oo=new two();
		oo.show();

	}

}
