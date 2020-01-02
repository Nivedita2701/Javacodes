package OOPS;

class A1
{
	public  A1()
	{
		System.out.println("this is class  a");
	}
	public void add()
	{
		System.out.println("addition of numbers");
	}
}
class B1 extends A1
{
	public  B1()
	{
		System.out.println("this is class b");
	}
	public void sub()
	{
		System.out.println("this is subtraction");
	}
}
public class Multilevelnheritance extends B1{

	public Multilevelnheritance()
	{
		System.out.println("this is class c");
	}
	public void mul() {
		System.out.println("this is multiplication");
	}
	public static void main(String[] args) {
		A1 o=new A1();
		o.add();
		System.out.println();
		B1 oo=new B1();
		oo.add();
		oo.sub();
		System.out.println();
		Multilevelnheritance ooo=new Multilevelnheritance();
		ooo.add();
		ooo.sub();
		ooo.mul();
		
		
	}

}
