package StringDemo;
import java.util.Scanner;

public class BadWords {
	Scanner sc=new Scanner(System.in);
	String str[]= {"Stupid","Rascal","Nonsense"};
				
	public void check()
	{
		System.out.println("Enter the string");
		String st=sc.nextLine();		
				
		for(int i=0;i<str.length;i++)
		{
			//String sd=str[i].toString();
			if(st.contains(str[i]))
			{
				st=st.replaceAll(str[i],"*****");
				
			
			}
		}
		System.out.println(st);
	}
 			
		//System.out.println(a[i]);
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadWords oo=new BadWords();
		oo.check();
	}

}
