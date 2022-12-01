package day13.Inheritance;
class company {
	void display() {
		System.out.println("i am diplay method of class company");
	}
}
class employee1 extends company {
	void display() {
		super.display();
		System.out.println("i am diplay method of class employee1");
	}
	void callme() {
		System.out.println("i am callme method of class employee1");
	}
	
}
public class Inheritance9 {

	public static void main(String[] args) {
		employee1 e1=new employee1();
		e1.display();
		e1.callme();
		
		company c=new company();
		c.display();
		
		employee1 e2=new employee1();
		e2.display();
	}

}
