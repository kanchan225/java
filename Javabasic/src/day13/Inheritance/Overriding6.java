package day13.Inheritance;
class parent2{
	private void m1() {
		System.out.println("From parent m1");
	}
	protected void m2() {
		System.out.println("From parent m2");
	}
}
class Child2 extends parent2{
	public void m1() {// no overriding here as its a private method & it is Unique method of child class
		System.out.println("From child m1");
	}
	public void m2() {
		System.out.println("From child m2");
	}
}

public class Overriding6 {

	public static void main(String[] args) {
		parent2 obj1=new parent2();
		obj1.m2();
		// obj1.m1();--->compiler error will be there as private method can not be access outside the class
		parent2 obj2=new Child2();
		obj2.m2();
		//obj2.m1();

	}

}
