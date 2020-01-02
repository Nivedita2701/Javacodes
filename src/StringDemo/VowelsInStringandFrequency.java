package StringDemo;
import java.util.Scanner;

public class VowelsInStringandFrequency {
	Scanner sc=new Scanner(System.in);
	String s;
	int count;
	public void vowel()
	{
		System.out.println("Enter the String");
		s=sc.nextLine();
		char a[]=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
			{
				System.out.print(a[i]);
				count=count+1;
				System.out.println(i);
			}
		}
		System.out.print(+count);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelsInStringandFrequency oo=new VowelsInStringandFrequency();
		oo.vowel();
		
	}

}
