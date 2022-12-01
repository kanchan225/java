package day13.Inheritance;
class A1{
   //default constructor
	static int a=10;
	int b=20;
	double c=23.45;
}
class B1 extends A1{
	   /*default constructor with default super statement
	   B1(){
	    super();
	     }
	     */
	// non static members of A1 class are virtually present in B1 class
		static int x=25;
		int y=30;
		double z=123.45;
	}
class C1 extends B1{
	   /*default constructor with default super statement
	   C1(){
	    super();
	     }
	     */
	// non static members of B1 class are virtually present in C1 class
		static int p=101;
		int q=35;
		double r=55.45;
	}
public class Inheritance1 {

	public static void main(String[] args) {
		System.out.println("***********Access class A1 static members***********");
		System.out.println("Class A1 static variable a ="+A1.a);
		System.out.println("***********Access class B1 static members***********");
		System.out.println("Class B1 static variable x ="+B1.x);
		System.out.println("***********Access class C1 static members***********");
		System.out.println("Class C1 static variable p ="+C1.p);
		
		System.out.println("***********Access Non-static members***********");
		C1 obj1=new C1(); // it will have all the non-static members of class A1,B1,C1
		System.out.println("Class A1 Non-static variable b with class C1 refer ="+obj1.b);
		System.out.println("Class A1 Non-static variable c with class C1 refer ="+obj1.c);
		System.out.println("Class B1 Non-static variable y with class C1 refer ="+obj1.y);
		System.out.println("Class B1 Non-static variable z with class C1 refer ="+obj1.z);
		System.out.println("Class C1 Non-static variable q with class C1 refer ="+obj1.q);
		System.out.println("Class C1 Non-static variable r with class C1 refer ="+obj1.r);

		B1 obj2=new B1(); // it will have all the non-static members of class A1,B1
		System.out.println("Class A1 Non-static variable b with class B1 refer ="+obj2.b);
		System.out.println("Class A1 Non-static variable c with class B1 refer ="+obj2.c);
		System.out.println("Class B1 Non-static variable y with class B1 refer ="+obj2.y);
		System.out.println("Class B1 Non-static variable z with class B1 refer ="+obj2.z);
	}

}
