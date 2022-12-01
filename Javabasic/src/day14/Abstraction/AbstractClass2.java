package day14.Abstraction;
abstract class RBIbank{
	abstract double getRateOfInterestForHomeLoan();
	final void loan() {
		System.out.println("As per RBI loan....");
	}
}
class SBI extends RBIbank{
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
} 
class PNB extends RBIbank{
	double getRateOfInterestForHomeLoan() {
		return 7.5;
	}
} 
public class AbstractClass2 {

	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.loan();
		System.out.println("SBI Rate of Interest : "+s1.getRateOfInterestForHomeLoan()+"%");
		PNB p1=new PNB();
		System.out.println("PNB Rate of Interest : "+p1.getRateOfInterestForHomeLoan()+"%");
		RBIbank r1=new SBI();
		r1.loan();
		System.out.println("RBI reference,SBI Rate of Interest : "+r1.getRateOfInterestForHomeLoan()+"%");
		RBIbank r2=new PNB();
		System.out.println("RBI reference,PNB Rate of Interest : "+r2.getRateOfInterestForHomeLoan()+"%");
	    p1.loan();
	}

}
