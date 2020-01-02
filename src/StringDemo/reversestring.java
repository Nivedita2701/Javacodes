package StringDemo;
import java.util.Scanner;

public class reversestring {
	 Scanner sc=new Scanner (System.in);
	 String rev="",s;
	 
	public void rev()
	{
		{
			System.out.println("Enter the String");
			s=sc.nextLine();
			int size=s.length();
			for(int i=size-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			
		}
		
		System.out.print(rev);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversestring o=new reversestring();
		o.rev();
	}

}
