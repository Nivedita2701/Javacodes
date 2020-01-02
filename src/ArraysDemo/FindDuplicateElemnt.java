package ArraysDemo;

public class FindDuplicateElemnt {
	int a[]={1,2,3,4,9,8,6};
	int temp=0;
	
	public void dup()
	{
		
		System.out.println("Duplicate elements are");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] )
				{
					System.out.println(a[j]+" ");
					temp=temp+1;
				}
				
				}
		}
		
	if(temp==0)
	{
			System.out.println("No duplicate elements");
	}
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicateElemnt oo=new FindDuplicateElemnt();
		oo.dup();
	}

}
