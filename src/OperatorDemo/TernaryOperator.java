package OperatorDemo;

public class TernaryOperator {
int a=10,b=20,res;
public void acc()
{
	res=(a>b)?a:b;
	System.out.println("Largest no is:"+res);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TernaryOperator oo= new TernaryOperator();
		oo.acc();
	}

}
