package Inheritance;

class A0
{
	int a=10;
}
class B0 extends A0
{
	int a=20;
	void show(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
}

public class SuperThiskeyword {

	public static void main(String[] args) {
		B0 oo=new B0();
		oo.show(60);

	}

}
