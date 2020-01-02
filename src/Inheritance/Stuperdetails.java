package Inheritance;
import java.util.Scanner;

public class Stuperdetails {
	int Rollno,Contactno;
	String name;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("enter rollno");
		Rollno=sc.nextInt();
		
		System.out.println("Enter name");
		name=sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter contactno");
		Contactno=sc.nextInt();
		
	}
	public void disp()
	{
		System.out.println("Roll no is:"+Rollno);
		System.out.println("name is :"+name);
		System.out.println("Contact is:"+Contactno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
