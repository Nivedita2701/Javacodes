package StringDemo;
import java.util.Scanner;

public class UpperCaseString {
	Scanner sc=new Scanner(System.in);
	String s,str,str1;
	public void up()
	{
		System.out.println("enter the string");
		s=sc.nextLine();
	
	    str=s.toUpperCase();
	    str1=s.toLowerCase();
	    System.out.println(str);
	    System.out.println(str1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperCaseString oo=new UpperCaseString();
		oo.up();
		
	}

}
