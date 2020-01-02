package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class EmployeeArrayList {
	Scanner sc = new Scanner(System.in);
	int employeeid;
	public void accept()
	{
		ArrayList<Employee> ab=new ArrayList<Employee>();
		ab.add(new Employee(1, "5-jan-2019", 'A',10000, "aman"));
		ab.add(new Employee(2, "16-jan-2019", 'c',50000, "Raman"));
		ab.add(new Employee(3, "25-jan-2019", 'A',80000, "karman"));
		//ab.remove(1);
		
		for(Employee k:ab)
		{
	System.out.println("employee id:"+k.empid+" Date of joining :"+k.doj+" Grade:"+k.grade+" Salary:"+k.salary+" Name:"+k.name);
		
		}
		System.out.println("Enter the empid for deletion:");
		employeeid =sc.nextInt();
		if(employeeid!=0)
		ab.remove(employeeid-1);
		else
		ab.remove(employeeid);	
		System.out.println("after deletion result:");
		for(Employee k:ab)
		{
	System.out.println("employee id:"+k.empid+" Date of joining :"+k.doj+" Grade:"+k.grade+" Salary:"+k.salary+" Name:"+k.name);
		
		}
		
		
		
		
		//System.out.println("employee id:"+k.empid+" Date of joining :"+k.doj+" Grade:"+k.grade+" Salary:"+k.salary+" Name:"+k.name);
			}
		
	
		
		//Iterator<Employee> abc=ab.iterator();
		//while(abc.hasNext())
		//{
			//System.out.println(abc.next());
			
		//}
		//Iterator itr = al.iterator();
	      
	      //while(itr.hasNext()) {
	        // Object element = itr.next();
	         //System.out.print(element + " ");
	      //}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeArrayList oo=new EmployeeArrayList();
		oo.accept();
		

	}

}
