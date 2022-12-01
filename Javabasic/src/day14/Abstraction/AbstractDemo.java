package day14.Abstraction;
abstract class demo{//( 0% abstract)
	void print() {
	System.out.println("I am non-abstract method print");	
	}
    void display() {
    	System.out.println("I am non-abstract method display ");	
	}
}
abstract class demo1{ //( 50% abstract)
    abstract void display();
	void print() {
	System.out.println("I am non-abstract method print");	
	}
}
abstract class demo2{ //( 100% abstract)
	abstract void display();
	abstract void display2();
	abstract void print();
}	
public class AbstractDemo {

	public static void main(String[] args) {
		

	}

}
