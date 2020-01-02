package ArraysDemo;
import java.util.Scanner;

public class RemoveDUplicateElemntSortedArray {
	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,2,3,4,5,5,};
	int b[]=new int[a.length];
	public void duplicate()
	{int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				b[j]=a[i];
				j++;
			}
		}
		b[j]=a[a.length-1];
		for(int i=0;i<a.length;i++)
		{
		System.out.println(b[j]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDUplicateElemntSortedArray o=new RemoveDUplicateElemntSortedArray();
		o.duplicate();
	}

}
