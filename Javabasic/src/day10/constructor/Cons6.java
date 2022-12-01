package day10.constructor;

class C {
	double i;
	C(double j) {
		System.out.println("Running Class C constructor");
		i=j;
	}
}
public class Cons6 {

	public static void main(String[] args) {
		System.out.println("Main() of  Class Cons6 is started...");
		C c1= new C(25.34);
		System.out.println("class c global variable i = "+c1.i);
		c1.i=14.65;
		System.out.println("class c global variable i = "+c1.i);
		System.out.println("******************************************");
		C c2= new C(55.32);
		System.out.println("class c global variable i = "+c2.i);

	}

}
