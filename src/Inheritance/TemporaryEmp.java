package Inheritance;

public class TemporaryEmp extends Employee{
	int paid_leave,sick_leave,casual_leave,Leave_without_pay;
	double basic=40000, hra,pf=0,one_day_salary,deduction;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		System.out.println("pf is "+pf);
		hra=(0.50 * basic);
		System.out.println("hra is "+hra);
		for(int i=0;i<Leave_without_pay;i++)
		{
		 one_day_salary=basic/30; //months ke according 30,31 or 29 generalize krna h 
			deduction=basic-one_day_salary;
		 
		}
		System.out.println(deduction);
		total_salary= basic+hra-pf-deduction;
		
		System.out.println("Total Salary is "+total_salary);
		
		
	}

}
