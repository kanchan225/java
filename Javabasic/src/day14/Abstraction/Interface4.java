package day14.Abstraction;
interface printable1{
	void print();
}
interface showable1{
	void print();
}
public class Interface4 implements printable1, showable1{
	public void print() {
		System.out.println("Hello, Print");
	}
    public static void main(String[] args) {
	Interface4 obj =new Interface4();
	obj.print();
	printable1 obj1 =new Interface4();
	obj1.print();
	showable1 obj2 =new Interface4();
	obj2.print();
	}

}
