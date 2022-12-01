package day10.constructor;

public class ConsOverLoading {
	int a;
	ConsOverLoading() {
		System.out.println("This is zero parameter constructor");
		System.out.println("having no parameter");
	}
	ConsOverLoading(int a) {
		System.out.println("This is parameterized constructor");
		System.out.println("having int parameter");
	}
	ConsOverLoading(double b) {
		System.out.println("This is parameterized constructor");
		System.out.println("having double parameter");
	}
	ConsOverLoading(int a, double b, int c) {
		System.out.println("This is parameterized constructor");
		System.out.println("having int, double, int parameters");
	}
	ConsOverLoading(double a, int b, int c) {
		System.out.println("This is parameterized constructor");
		System.out.println("having double, int, int parameters");
	}

	public static void main(String[] args) {
		ConsOverLoading c5= new ConsOverLoading();
		c5.a=12;
		ConsOverLoading c2= new ConsOverLoading(11);
		ConsOverLoading c3= new ConsOverLoading(25.5);
		ConsOverLoading c1= new ConsOverLoading(25, 22.5, 30);
		ConsOverLoading c4= new ConsOverLoading(23.45, 12, 456);

	}

}
