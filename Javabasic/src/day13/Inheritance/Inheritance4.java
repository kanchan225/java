package day13.Inheritance;
class Vehicle{
	public void wheels() {
		System.out.println("I have 4 wheels");
	}		
}
class bike extends Vehicle{
	public void countwl() {
		System.out.println("I am bike and has 2 wheels");
	}		
}
class car1 extends Vehicle{
	public void countwlc() {
		System.out.println("I am car and has 4 wheels");
	}		
}
class scooter extends Vehicle{
	public void countwls() {
		System.out.println("I am scooter and has 2 wheels");
	}		
}

public class Inheritance4 {

	public static void main(String[] args) {
		car1 c=new car1();
		c.wheels();
		c.countwlc();
		//c.countwl();
		
		bike b=new bike();
		b.wheels();
		b.countwl();
		
		scooter s=new scooter();
		s.wheels();
		s.countwls();
		//s.countwl();
	}

}
