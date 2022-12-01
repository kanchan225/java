package day13.Inheritance;
class Human{
	void eat() {
		System.out.println("Human is eating");
	}
	private void MyMethod() {
		System.out.println("MyMethod class Human");
	}
}
class Boy extends Human{
	protected void eat() {
		System.out.println("Boy is eating");
	}
	protected void MyMethod() {
		System.out.println("MyMethod class Boy");
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		Human h=new Boy();
		h.eat();
		//h.MyMethod(); can not call as method is private
		Human h1=new Human();
		h1.eat();
		//h1.MyMethod();
		Boy b1=new Boy();
		b1.eat();
		b1.MyMethod();
	}

}
