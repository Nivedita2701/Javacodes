package Collections;

import java.util.ArrayList;

public class StudentArayList {
public void accept()
{
	ArrayList<StudentDemo> al=new ArrayList<StudentDemo>(); 
	al.add(new StudentDemo(1, "pooja"));
	al.add(new StudentDemo(2, "Manisha"));
	al.add(new StudentDemo(3, "Ram"));
	al.add(new StudentDemo(4, "anhsd"));
	for(StudentDemo s:al)
	{
		System.out.println("rollno is:"+s.rollno+" name:"+s.name);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentArayList obj=new StudentArayList();
		obj.accept();
	}

}
