package OOPS;

public class TypeCasting {

	public static void main(String[] args) {
		byte b=100;
		short s=b; // implicit Casting
		long l=s;
		int a= s;
		float f=s;
		double d=f;
		System.out.println(+b);
		System.out.println(+d );
		System.out.println(+f);
		
		int n=28;
		byte z=(byte) n;
		float k=38;
		z=(byte)k;
		System.out.println(+n);
		System.out.println(+k);
		

	}

}
