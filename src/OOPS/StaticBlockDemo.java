package OOPS;
import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticBlockDemo {
	static int num1;
	static
	{
		num1=100;
		System.out.println(num1);
	}
	public void acc()
	{
		System.out.println("hello");
		System.out.println(Math.PI);
		System.out.println(Math.abs(num1));
		System.out.println(Math.acos(10.33));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockDemo oo=new StaticBlockDemo();
		oo.acc();
	}

}
