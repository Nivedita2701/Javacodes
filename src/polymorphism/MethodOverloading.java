package polymorphism;

class  Aone
{
	void show(int a, int b)
	{
		System.out.println(1);
	}
	void show(String a)
	{
		System.out.println(2);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		Aone oo=new Aone();
		oo.show("pooja");

	}

}
