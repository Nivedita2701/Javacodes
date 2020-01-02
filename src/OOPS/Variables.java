package OOPS;

public class Variables {
	int num1; //instance variable called by object
	static int num2;// need not to create the object called either by class or as it is
		
	public void acc()
	{
		int a=100;//local variable and it should always be initialized;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables oo=new Variables();
		System.out.println(oo.num1);
		System.out.println(num2);
		oo.acc();
		
		
	}

}
