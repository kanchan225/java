package day13.Inheritance;
class Animals2 {
	public void move() {
		System.out.println("Animals can move");
	}
	 void display() {
		System.out.println("I am display() of Animals2 class");
	}
}
class Dog2 extends Animals2 {
	public void move() {
		System.out.println("dogs can walk and run");
		display();
		// Animals2 a=new Animals2();
		// a.move();
		//or
		super.move();
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		Animals2 a1=new Dog2();// Animals2 reference but dog object
		a1.move();//move() of Dog2 class is called
         
	}

}
