package OOPS;

class employee
{
	private int empid;
	
	public void SetEmpid(int eid)
	{
		empid=eid;
	}
	public int GetId()
	{
		return empid;
		
	}
}
public class EncapsulationCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.SetEmpid(101);
		System.out.println(e.GetId());
		
	}

}
