package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {
	public void accept()
	{
		// ArrayList a1=new ArrayList(); //Non Genric 
		ArrayList<Object> al=new ArrayList<Object>(); //genric 
		al.add(123);
		al.add("Manisha");
		al.add("SDET");
		al.add("RCH0190132");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.remove(2);
		System.out.println("new array list is "+al);
		Iterator ii=al.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylistdemo oo=new Arraylistdemo();
		oo.accept();
		
	}

}
