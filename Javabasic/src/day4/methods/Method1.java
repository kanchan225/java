package day4.methods;

public class Method1 {
	
	static double getSI( int p, int t, float r) {
		double si=(p*r*t)/100;
		System.out.println("Principle amount is:"+p);
		System.out.println("rate of interest is:"+r);
		System.out.println("Duration is:"+t);
		System.out.println("simple interest to be paid:"+si);
		return si;
	}
	public static void main(String[] args) {
		 int amount=95000;
	        int duration=2;
	        float roi=4.5f;
	        double interest=getSI(amount, duration,roi);
	       // System.out.println(interest)
	        //int p=7000;
	       // int t=3;
	       // float r=5;
	        //double finalamount=getSI(p, t, r);
	}	
}
