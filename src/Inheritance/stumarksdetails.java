package Inheritance;

public class stumarksdetails extends Stuperdetails{
	int hindi,maths;
	public void acc()	
	{
		super.accept();
		disp();
		System.out.println("enter marks in hindi");
		hindi=sc.nextInt();
		
		System.out.println("enter the  marks in maths");
		maths=sc.nextInt();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stumarksdetails oo=new stumarksdetails();
		oo.acc();
	}

}
