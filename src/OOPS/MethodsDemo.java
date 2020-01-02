package OOPS;

public class MethodsDemo {
	int sum;
public int add(int num1,int num2)
{
return sum=num1+num2;	
}
public void sub()
{
	System.out.println(add(102,33));//calling of method
	
}
public void sum(int num1, int num2)
{
	sum=num1+num2;
	System.out.println(sum);//taking something returning nothing
}
public int acc()
{
	return sum;//taking nothing returning something
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo o=new MethodsDemo();
		System.out.println(o.add(10, 20));
		o.sub();
		o.sum(1223,44);
		System.out.println(o.acc());
	}

}
