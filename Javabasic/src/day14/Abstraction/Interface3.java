package day14.Abstraction;
interface printable{
	int age =26;// by default public static final
	void print();
	}
interface showable{
	public void show();
}
public class Interface3 implements printable, showable{
	static int age=30;
	public void print() {
		System.out.println("Hello, print");
	}
    public void show() {
    	System.out.println("Welcome, show");
    }
	public static void main(String[] args) {
		System.out.println(printable.age);
		System.out.println(age);//Interface3.age
		Interface3 obj=new Interface3();
		obj.print();
		obj.show();
	}

}
