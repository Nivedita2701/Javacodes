package OOPS;

interface I1
{
	void show();
	default void display()
	{
		System.out.println("ashole");
	}
}
interface I2
{
	void displayit();
	
}
class test implements I1 ,I2
{

	@Override
	public void show() {
		System.out.println("sjk");
		
	}

	@Override
	public void displayit() {
		System.out.println("2njds");
		
	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		test t=new test();
		t.show();
		t.displayit();
		t.display();

	}

}
