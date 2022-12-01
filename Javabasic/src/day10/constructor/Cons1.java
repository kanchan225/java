package day10.constructor;

public class Cons1 {
	Cons1() {
		System.out.println("This is zero parameter constructor");
	}
	public Cons1(char c) {
		System.out.println("This is single parameter constructor");
	}
	Cons1(int num1, int num2) {
		System.out.println("This is int-int parameter constructor");
	}
	Cons1(double num1, int num2) {
		System.out.println("This is double-int parameter constructor");
	}
	Cons1(int num1, double num2) {
		System.out.println("This is int-double parameter constructor");
	}

	public static void main(String[] args) {
		Cons1 c1= new Cons1();
		Cons1 c2= new Cons1(10, 20);
		Cons1 c3= new Cons1('d');
		Cons1 c4= new Cons1(25, 30.5);
		Cons1 c5= new Cons1(22.25, 10);

	}

}
