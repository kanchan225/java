package day13.Inheritance;
class A {
	static int a=10;
	int b=20;
	double c=13.25;
}
class B {
	static int x=30;
	int y=40;
	double z=53.25;
}
class C {
	static int p=25;
	int q=38;
	double r=111.278;
}
public class Inheritance0 {

	public static void main(String[] args) {
		System.out.println("***********Access class A static members***********");
		System.out.println("Class A static variable a ="+A.a);
		System.out.println("***********Access class B static members***********");
		System.out.println("Class B static variable x ="+B.x);
		System.out.println("***********Access class C static members***********");
		System.out.println("Class C static variable p ="+C.p);
		
		System.out.println("***********Access class A Non-static members***********");
		A obj1=new A();
		System.out.println("Class A Non-static variable b ="+obj1.b);
		System.out.println("Class A Non-static variable c ="+obj1.c);
		System.out.println("***********Access class B Non-static members***********");
		B obj2=new B();
		System.out.println("Class B Non-static variable y ="+obj2.y);
		System.out.println("Class B Non-static variable z ="+obj2.z);
		System.out.println("***********Access class C Non-static members***********");
		C obj3=new C();
		System.out.println("Class C Non-static variable q ="+obj3.q);
		System.out.println("Class C Non-static variable r ="+obj3.r);

	}

}
