package StringDemo;
import java.util.Scanner;

public class CountSandOccurence {
	
	String str ="what's the matter son your school notebooks are still uncovered";
	int count=0;
	public void check()
	{
		System.out.print(str);
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='s')
			{
				count=count+1;
				System.out.println(i);
			}
			
		}
		System.out.println(+count);
		
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountSandOccurence oo=new CountSandOccurence();
		oo.check();
	}

}
