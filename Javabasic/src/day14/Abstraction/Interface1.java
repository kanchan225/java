package day14.Abstraction;
interface drawable{
	int salary=25000;// by default, public static final int salary=25000;
	void draw(); // by default, public abstract void draw();
}
class rectangle1 implements drawable{
	public void draw() {
		System.out.println(" drawing rectangle");
	}
}
class circle1 implements drawable{
	public void draw() {
		System.out.println(" drawing circle");
	}
}
public class Interface1  {

	public static void main(String[] args) {
		System.out.println("Interface variable salary :"+drawable.salary);
		rectangle1 r1=new rectangle1();
		r1.draw();
		circle1 c1=new circle1();
		c1.draw();
		drawable d=new circle1();// circle class object is created and referred by interface drawable
		d.draw();
	}

}
