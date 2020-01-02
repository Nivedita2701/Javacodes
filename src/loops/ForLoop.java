package loops;
import java.util.Scanner;
public class ForLoop {
	int num;
public void acc()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the table");
	num=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(num+"*"+i+"="+num*i);
		
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ForLoop oo= new ForLoop();
oo.acc();

	}

}
