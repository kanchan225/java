package day13.Inheritance;
class parent{
	void show() {
		System.out.println("Parent's show()");
	}
}
class child1 extends parent{
	public void show() {
		System.out.println("child's show()");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		parent obj1=new parent();
		obj1.show();
		
		parent obj2=new child1();
		obj2.show();
	}

}
