package Inheritance;

final class yes
{
	final void show()
	{
		System.out.println("hey this is first");
	}
}
//class no extends yes// we cannot extend final class thats why it shows error 
{
	//void show()// we cannot override the final method
	{
		System.out.println("hey this is second");
	}
}

public class finalkeyword {
	

	public static void main(String[] args) {
		final int i=10;
		//i=i+10; we cannot change the value for final keyword
		//System.out.println(i);
		no oo=new no();
		oo.show();
	}

}
