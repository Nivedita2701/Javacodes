package Inheritance;
import java.util.*;
public abstract class Employee {
int empId,total_leaves;
String empName;
double total_salary;
int paid_leave,sick_leave,casual_leave,Leave_without_pay;
double basic=40000, hra,pfa,one_day_salary,deduction;
Scanner sc=new Scanner(System.in);
public void emp()
{
	System.out.println("Enter your emp id:");
	empId=sc.nextInt();
	System.out.println("Enter your name:");
	empName=sc.next();
	sc.nextLine();
}
void print_leave_details()
{
	
	System.out.println("Enter the employee name");
	empName=sc.nextLine();
	System.out.println("enter the casual leaves");
	casual_leave=sc.nextInt();
	System.out.println("ente rthe sick leave");
	sick_leave=sc.nextInt();
	System.out.println("enter the paid leave");
	paid_leave=sc.nextInt();
	System.out.println("enter unpaid leaves");
	Leave_without_pay=sc.nextInt();
	

}

 abstract void calculate_balance_leaves();
 abstract boolean avail_Leave(int no_of_leaves, char type_of_leaves);
 abstract void calculate_salary();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
