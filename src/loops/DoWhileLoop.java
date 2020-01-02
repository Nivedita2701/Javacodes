package loops;
import java.util.Scanner;
public class DoWhileLoop {
	char choice;
	int num;
	Scanner sc=new Scanner(System.in);
	
	
public void cont()
{
		do {
			System.out.println("enter the table you want to print");
			num=sc.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"*"+i+"="+num*i);
			}
	
		System.out.println("enter the choice");
		choice=sc.next().charAt(0);
		}
	while(choice=='y');
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoWhileLoop oo=new DoWhileLoop();
		oo.cont();
	
	}

}
