package day13.Inheritance;
class parent5{
	void show() {
		System.out.println("from parent's show");
	}
}
class child5 extends parent5{
	void show() {
		System.out.println("from child's show");
	}
	void show1() {
		System.out.println("from child's show1");
	}
	
}
class Grandchild extends child5{
	void show() {
		System.out.println("from Grandchild's show");
	}
}
public class Overriding9 {

	public static void main(String[] args) {
		parent5 obj=new Grandchild();
         obj.show();
         parent5 obj1=new child5();
         obj1.show();
         child5 c1=new Grandchild();
         c1.show();
	}

}
