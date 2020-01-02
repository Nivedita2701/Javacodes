package CoditionalDemo;
import java.util.Scanner;
public class SwitchCaseDemo {
int num1,num2,res,Choice;
Scanner sc;
public void ChooseChoice()
{
	System.out.println("1.Add\t2.Subtract\n3.Multiply\t4.Divide\t");
	System.out.println("Enter your Choice");
	sc=new Scanner(System.in);
	Choice=sc.nextInt();
	System.out.println("enter first number");
	num1=sc.nextInt();
	
	System.out.println("enter Second number");
    num2=sc.nextInt();
    
    
   switch(Choice)
   {
	   case 1:
		   res=num1+num2;
   System.out.println("result of addittion is:"+res);
   break;
   
   case 2:
	   res=num1-num2;
   System.out.println("result of Subtraction is:"+res);
   break;
   
   case 3:
	   res=num1*num2;
   System.out.println("result of multiplication is:"+res);
   break;
   
   case 4:
	   res=num1/num2;
	   System.out.println("result of division is:"+res);
	   break;
	 
   
   }
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwitchCaseDemo oo=new SwitchCaseDemo();
oo.ChooseChoice();
	}

}
