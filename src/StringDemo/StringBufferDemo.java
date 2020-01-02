package StringDemo;

public class StringBufferDemo {
	
	public void acc()
	{
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" how are you?");
		System.out.println(sb);
		sb.delete(2,5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		StringBuilder bld=new StringBuilder("welcome");
		bld.append(" to btes");
		System.out.println(bld);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferDemo oo=new StringBufferDemo();
		oo.acc();
		
	}

}
