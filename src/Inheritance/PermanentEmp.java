package Inheritance;
import java.util.Scanner;

public class PermanentEmp extends Employee{
	int paid_leave,sick_leave,casual_leave,Leave_without_pay;
	double basic=40000, hra,pfa,one_day_salary,deduction;
	
	Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("enter choice 1 or 2");
		Scanner sc= new Scanner (System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		{	PermanentEmp obj=new PermanentEmp();
			obj.print_leave_details();
			obj.calculate_salary();
			break;
		}	
		case 2:
		{
			TemporaryEmp o=new TemporaryEmp();
			o.print_leave_details();
			o.calculate_salary();
			break;
		}	
		default:
			System.out.println("nivedita pagal hai");
		}
		
		
	
	}
	



	@Override
	void calculate_balance_leaves() {
		// TODO Auto-generated method stub	
	}


	@Override
	boolean avail_Leave(int no_of_leaves, char type_of_leaves) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	void calculate_salary() {
		// TODO Auto-generated method stub
		double pf = (0.12 * basic);
		System.out.println("pf is "+pf);
		hra=(0.50 * basic);
		System.out.println("hra is "+hra);
		for(int i=0;i<Leave_without_pay;i++)
		{
		 one_day_salary=basic/30; //months ke according 30,31 or 29 generalize krna h 
		 System.out.println("one day salary "+one_day_salary);
			deduction=basic-one_day_salary;
		 
		}
		System.out.println(deduction);
		total_salary= basic+hra-pf-deduction;
		
		System.out.println("Total Salary is "+total_salary);
		
		
	
	}

}
