package ArraysDemo;
import java.util.Scanner;

public class SingleD {
//int[] rollno= {1,2,3,4,5};
int[] rollno;
int counter,i,size;
Scanner s=new Scanner(System.in);

public void get()
{
	System.out.println("enter size of array");
	size=s.nextInt();
	rollno=new int[size];
	
	System.out.println("enetr elemnts of array");
	
	for(i=0;i<rollno.length;i++)
	{
		rollno[i]=s.nextInt();
		}
	//for(counter=0;counter<=4;counter++) {
	//System.out.println(rollno[counter]);
	for(int roll:rollno) {
		System.out.println(roll);
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleD o=new SingleD();
		o.get();
		
	}

}
