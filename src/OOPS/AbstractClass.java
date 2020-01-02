package OOPS;

abstract class vehicle
{
	abstract void start();
}
 class Car extends vehicle
 {

	@Override
	void start() {
		System.out.println("start with key");
		
	}
 }
	
	class Scooter extends vehicle
	{

		@Override
		void start() {
			System.out.println("start with kick");
			
		}
		
	}
	 
 

public class AbstractClass {

	public static void main(String[] args) {
		Car o=new Car();
		o.start();
		Scooter s=new Scooter();
		s.start();
		

	}

}
