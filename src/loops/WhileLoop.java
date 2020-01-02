package loops;
import java.util.Scanner;

public class WhileLoop {
	int a,b=1,res,Scanner;
	
	public void table()
	{
		System.out.println("enter the table");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(b<=10)
		{
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			b++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop oo=new WhileLoop();
		oo.table();
		
	}

}
