package OperatorDemo;

     public class Postfit {
     int a=10,b;
     public void postOp()
{
	b=a++;//Postfix;
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Postfit oo=new Postfit();
   oo.postOp();
	}

}
