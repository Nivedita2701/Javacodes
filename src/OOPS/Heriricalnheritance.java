package OOPS;

class A
{
	public void showA()
	{
		System.out.println("this is class A");
	}
}
class B extends A
{
	public void showB()
	{
		System.out.println("this is class b");
	}
}

public class Heriricalnheritance extends A {

	public void showC()
	{
		System.out.println("this is class c");
	}
	public static void main(String[] args) {
		A o=new A();
		o.showA();
		
		B oo=new B();
		oo.showA();
		oo.showB();
		
		Heriricalnheritance ooo=new Heriricalnheritance();
		ooo.showA();
		ooo.showC();
		
		
		
		

	}

}
