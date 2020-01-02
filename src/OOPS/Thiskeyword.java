package OOPS;

public class Thiskeyword {
	int num=393;
	public void acc(int num)
	{
		
		System.out.println(this.num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword oo=new Thiskeyword();
		oo.acc(20);
	}

}
