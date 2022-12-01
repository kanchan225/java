package day14.Abstraction;
interface Printable2{
	void print();
}
interface Showable2 extends Printable2{
	//public void print();----> inherited method , virtually present in interface showable2
    void show();
}
public class Interface5 implements Showable2{
	public void print() {
		System.out.println("Hello, Print");
	}
	public void show() {
		System.out.println("Hello, show");
	}
	public static void main(String[] args) {
		Interface5 obj=new Interface5();
		obj.print();
		obj.show();
		Printable2 obj2=new Interface5();
		obj2.print();
		//obj2.show();
		Showable2 obj3=new Interface5();
		obj3.print();
		obj3.show();
	}

}
