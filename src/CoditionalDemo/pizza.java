package CoditionalDemo;
import java.util.Scanner;
public class pizza {
int a,b,choice,choice1,choice2;
Scanner sc;
public void choosechoice()
{
	System.out.println("1.Pizza\t2.French fries\t");
	System.out.println("enter your choice");
	sc=new Scanner(System.in);
	choice=sc.nextInt();
	
	System.out.println("1.Cheese capsicum\t2.corns\t3.Farm house\t");
	System.out.println("enter the flavour");
	choice1=sc.nextInt();
	
	System.out.println("1.Large\t2.Medium\t3.Small\t");
	System.out.println("enter the size");
	choice2=sc.nextInt();
	

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
pizza oo=new pizza();
oo.choosechoice();
	}

}
a