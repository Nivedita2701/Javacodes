package OOPS;

class Animal
{
	public void eat()
	{
		System.out.println("i am eating ");
	}
}

public class SampleInheritance extends Animal{

	public static void main(String[] args) {
		SampleInheritance oo=new SampleInheritance();
		oo.eat();

	}

}
