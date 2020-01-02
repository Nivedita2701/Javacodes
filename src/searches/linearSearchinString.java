package searches;
import java.util.Scanner;


public class linearSearchinString {
	Scanner s=new Scanner (System.in);
	int temp=0;
	
	public void search()
	{
		System.out.println("Enter the Size of StringArray");
		 int size=s.nextInt();
		 String a[]=new String [size];
		System.out.println("enter the elements in the stringArray");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=s.nextLine();
		 }
		 System.out.println("Enter the string to be searched");
		 String k=s.nextLine();
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(k))
			{
				System.out.println("This is the Stirng at "+i+" Index value");
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("String not Present");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linearSearchinString o=new linearSearchinString();
		o.search();

	}

}
