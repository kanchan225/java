package day13.Inheritance;
class parent4{
	static void m1() {
		System.out.println("from parent " +"static m1()" );
	}
	 void m2() {
		System.out.println("from parent "+ "non-static(instance) m2()");
	}
}
class child4 extends parent4{
	static void m1() {
		System.out.println("from child " +"static m1()" );
	}
	 void m2() {
		System.out.println("from child "+ "non-static(instance) m2()");
	}
}
public class Overriding8 {

	public static void main(String[] args) {
		parent4 obj=new child4();
		obj.m1();//m1() of parent4 will be executed as it is static method & it does not get override nor inherite
		obj.m2(); 

	}

}
