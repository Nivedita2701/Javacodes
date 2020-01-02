package StringDemo;

public class FirstDemo {
	String str="Ritika",st;//Literal
	String str1=new String("Pooja");//heap Memory
	int a=100,b=230;
	char a1;
	public void Check()
	{
		System.out.println(str);
		System.out.println(str1);
		//System.out.println(a+b+str+str1);//operator overloading + is being overloaded
		//System.out.println(a+b+str+str1);//adding and then concatination
		//System.out.println(str+str1+a+b);//concatination will be done because integer data after sting is used 
		a1=str.charAt(1);
		System.out.println("Charatcer at index 1"+a1);
		st=str.concat(st);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDemo oo=new FirstDemo();
		oo.Check();

	}

}
