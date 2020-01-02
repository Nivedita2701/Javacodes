package OOPS;

public class ConstructorDemo {
	int rollno;
	String name;
	public ConstructorDemo()//default constructor
	{
		rollno=1;
		name="Ishita";
	}
	public ConstructorDemo(String name)
	{
		System.out.println(name);
	}
	public ConstructorDemo(int num)//Parameterized constructor
	{
		this();
		//this will call either one of the constructor not the both//this("pooja");
		num=100;
		System.out.println(num);
	}
	public void display()
	{
		System.out.println("roll no is:" +rollno);
		System.out.println("name is " +name);
	}
	public void display(int num1,int num2)//method overloading
	{
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//ConstructorDemo o=new ConstructorDemo();
		ConstructorDemo oo=new ConstructorDemo(10);
		oo.display();
	}

}
