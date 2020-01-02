package StringDemo;
import java.util.Scanner;

public class StringPalindrome {
	Scanner sc=new Scanner(System.in);
	String s,rev="";
	public void Pal()
	{
			System.out.println("Enter the String");
			s=sc.nextLine();
			int size=s.length();
			for(int i=size-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			
			System.out.println(rev);
			
		if(s.equals(rev))
		{
			System.out.println(" it is a palindrome");
			
		}
		else
		{
			System.out.println(" not a Palindrome");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome oo=new StringPalindrome();
		oo.Pal();
	}

}
