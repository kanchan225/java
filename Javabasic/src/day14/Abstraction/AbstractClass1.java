package day14.Abstraction;
abstract class shape{
	abstract void draw();
	}
class rectangle extends shape{
	protected void draw() {
		System.out.println("drawing rectangle");
	}
}
class circle extends shape{
	public void draw() {
		System.out.println("drawing circle");
	}
}
public class AbstractClass1 {

	public static void main(String[] args) {
		shape s1=new rectangle();
        s1.draw();
        shape s2=new circle();
        s2.draw();
	}

}
