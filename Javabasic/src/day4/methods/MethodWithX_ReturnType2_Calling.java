package day4.methods;

public class MethodWithX_ReturnType2_Calling {
     
	static double getSI() {
		int p=55000, t=2;
		float r=5.5f;
		double si=(p*r*t)/100;
		System.out.println("Principle amount is:"+p);
		System.out.println("rate of interest is:"+r);
		System.out.println("Duration is:"+t);
		
		return si;
	}
	
	static double getSI( int p, int t, float r) {
		double si=(p*r*t)/100;
		System.out.println("Principle amount is:"+p);
		System.out.println("rate of interest is:"+r);
		System.out.println("Duration is:"+t);
		
		return si;
	}
	
	public static void main(String[] args) {
		getSI(); // we will be able to execute method body as won't get its return value to print or use
		System.out.println("********************* getSI with returnvalue in console***********************");
        System.out.println("Simple Interest to be paid:"+getSI()); //we will be able to execute method body as well as also get return value in the console
        System.out.println("********************* getSI, return value store in variable***********************");
	    double x=getSI();
	    //System.out.println("simple interest to be paid:"+x);
	    double finalAmountToBePaid= 55000+x;
        System.out.println("total amount to be paid including simple interest ="+finalAmountToBePaid);
        
        System.out.println("***********************With Parameters****************************");
        int amount=95000;
        int duration=2;
        float roi=4.5f;
        double interest=getSI(amount, duration,roi);
       //System.out.println("The interest value is:"+getSI(10000, 2, 4));
        double FinalAmount=amount+interest;
        System.out.println("total amount to be paid="+FinalAmount);
        System.out.println("***********************With Parameters 2****************************");
        interest=getSI(85000, 2, 4.5f);
        //System.out.println("The simple interest is:"+interest);
        FinalAmount=85000+interest;
        System.out.println("Total amount to be paid="+FinalAmount);
        //or
        System.out.println(getSI(20000,3,4));
        getSI(20000,3,4);
        
	}

}
