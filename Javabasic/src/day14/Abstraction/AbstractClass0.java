package day14.Abstraction;
abstract class abs1{
	abstract void call1();
	abstract void call2();
	void print() {
		System.out.println("Hello");
	}
}
abstract class abs2{
	abstract void call1();
	abstract void call2();
}
abstract class abs3{
	void display() {
		}
}
public class AbstractClass0 extends abs2 {
	void call1() {
		System.out.println("Hello call1");
	}
	void call2() {
		System.out.println("Hello call2");
	} 
	public static void main(String[] args) {
		AbstractClass0 d1=new AbstractClass0();
        d1.call1();
        d1.call2();
	}

}
