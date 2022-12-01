package day4.methods;

public class NSMethod_WithReturnType {
	
	double x=10, y=20, z=30;
	static double x1=25, y1=50, z1=75;
	public boolean CheckSameOrNot(int a, int b) {
		boolean res=(a==b);
		return res;
	}
	
	static void display() {
		  NSMethod_WithReturnType m2= new  NSMethod_WithReturnType();
		  System.out.println("Input the first number:"+m2.x);
		  System.out.println("Input the first number:"+m2.y);
		  System.out.println("Input the first number:"+m2.z);
	}

	public static void main(String[] args) {
	 display();

	 NSMethod_WithReturnType m1= new  NSMethod_WithReturnType();
	 
	 boolean res= m1.CheckSameOrNot(50,51);
	 System.out.println("Is both number same :"+res);
	 System.out.println("Is both number same :"+m1.CheckSameOrNot(55,55));
	 
	 m1.average(m1.x, m1.y, m1.z);
	 m1.average(x1, y1, z1);
	 m1.average(m1.x, y1, m1.z);
	 m1.average(70, 85, 90);
	 
	}
	
    public void average(double p, double q, double r) {
    	double res=(x+y+z) ;
    	System.out.println("result="+res);
    	
    	double avg=(p+q+r)/3;
    	System.out.println("Average of three numbers="+avg);
    	
    }
}
