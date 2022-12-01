package day4.methods;

public class MethodwithX_ReturnType3 {
   
	static int x=10, y=20, z=30;
	public static double average(double p, double q, double r) {
    	//return (p+q+r)/3;
    	 double average=(p+q+r)/3;
    	    return average;
    	 
	}	
	public static void main(String[] args) {
		System.out.println("Input the first number:"+x);
		System.out.println("Input the first number:"+y);
		System.out.println("Input the first number:"+x);
		System.out.println("The average value is:"+average(z, y, x));
		
		System.out.println("The average value is:"+average(65, 25, 80));
		System.out.println("The average value is:"+average(20, 30, 50));
		System.out.println("The average value is:"+average(50, 10, 30));
		
		int a=25, b=75, c=50;
		double avg= average(a, b, c);
		System.out.println("The average value is:"+avg);
		double result = avg+100;
		System.out.println("The final number is :"+result);	
	    double p=10, q=20, r=30;
	    avg =average(p, q, r);
	    System.out.println("The average value is:"+average(10, 20, 30));
	}
    
    
}
