package day4.methods;

public class MethodWithX_ReturnType {

	static double getSI() {
		int p=55000, t=2;
		float r=5.5f;
		double si=(p*r*t)/100;
		System.out.println("Principle amount is:"+p);
		System.out.println("rate of interest is:"+r);
		System.out.println("Duration is:"+t);
		System.out.println("simple interest paid by you:"+si);
		return si;
	}
	static double getSI(int p, int t, float r) {
		double si=(p*r*t)/100;
		System.out.println("Principle amount is:"+p);
		System.out.println("rate of interest is:"+r);
		System.out.println("Duration is:"+t);
		System.out.println("simple interest paid by you:"+si);
		return si;
	}

}
