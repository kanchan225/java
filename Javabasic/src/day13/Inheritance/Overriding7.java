package day13.Inheritance;
class parent3{
	final void show() {
		System.out.println("I am final show() method of parent class");
	}
}
class child3 extends parent3{
	/* void show() {  // this will show error as final method can not ovrriden
		System.out.println("I am final show() method of child class");
	}  */
}
public class Overriding7 {

	public static void main(String[] args) {
		parent3 p1=new parent3();
		p1.show();
		parent3 p2=new child3();
		p2.show();
         child3 c1=new child3();
         c1.show();// final method can be inherited but can not override

	}

}
