package Inheritance;

class good
{
	good()
	{
		System.out.println("this is first constructor");
	}
	good(int a)
	{
		System.out.println("this is integer"+a);
	}
	good(float b)
	{
		System.out.println("this is float"+b);
	}
}
class bad extends good
{
	bad()
	{
		//super(10); //if we dont use super it will call the default construtor automatically
		//super(10f);//otherwise we can give paramteres and call the constructor which  ever we want to create
		//super();this is to simply call default constructor but it will also be called automatucally
		System.out.println("this is second constructor");
	}
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		bad oo=new bad();
		

	}

}
