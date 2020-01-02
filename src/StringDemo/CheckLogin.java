package StringDemo;
import java.util.Scanner;

public class CheckLogin {
String uname,pass;
Scanner sc=new Scanner(System.in);

public void Check()
{
	System.out.println("enter username");
	uname=sc.next();
	
	System.out.println("enter password");
	pass=sc.next();
	if(uname.equalsIgnoreCase("admin")&& pass.equals("admin"))
	{
		System.out.println("you are valid user");
	}
	else
	{
		System.out.println("not a valid user");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
