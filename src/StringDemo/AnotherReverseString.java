package StringDemo;
import java.util.Scanner;


public class AnotherReverseString {
	Scanner sc=new Scanner(System.in);
	String rev=" ",s,rev1;
	
	public void rev()
	{
		System.out.println("Enter the String");
		s=sc.nextLine();
		int size=s.length();
		for(int i=size-1;i>=0;i--)
		{
			if(s.charAt(i)==(' '))
			{
				System.out.println(rev);
			}
			
			rev=rev+s.charAt(i);
		
			rev1=rev+s.charAt(i);
			
		}
		System.out.print(rev1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherReverseString oo=new AnotherReverseString();
		oo.rev();
		
	}

}
