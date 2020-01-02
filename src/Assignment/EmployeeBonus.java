package Assignment;

import java.util.Scanner;

public class EmployeeBonus {
char grade;
double basic, bonus;
Scanner sc=new Scanner (System.in);
public void calculate_bonus()
{
	System.out.println("1.M\t2.N\t");
System.out.println("enter your grade");
grade=sc.next().charAt(0);
System.out.println("enter the basic");
basic=sc.nextInt();


switch(grade)
{
	case 'M':
			
	if (basic>=20000)
	{
		System.out.print("bonus:1000");
	}
		else if (basic<20000)
		{
			System.out.print("bonus:7000");
		}
	
	break;
	
	case 'N':	if(basic>=15000)
			{
				System.out.print("bonus: 5000");
			}
			else if(basic<15000)
			{
				System.out.print("bonus: 3000");
			}
	
	break;
			
}

		

}

	public static void main(String[] args) {
		EmployeeBonus oo=new EmployeeBonus();
		oo.calculate_bonus();
		
	}

}
