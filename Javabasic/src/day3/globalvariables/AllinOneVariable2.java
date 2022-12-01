package day3.globalvariables;

public class AllinOneVariable2 {
    static float radius=10,area;
    double p, r, t, SI=(p*r*t)/100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int L=25, B=10, result;
     System.out.println("Length of rectangle="+L);
     System.out.println("Breadth of rectangle="+B);
     result=L*B;
     System.out.println("Area of rectangle="+result);
     short H=20;
     result=H*B;
     System.out.println(" Updated Area of rectangle="+result);
     System.out.println("*************Accessing Static members*************");
     area=(22/7)*radius*radius;
     System.out.println(" Area of circle ="+area);
     AllinOneVariable2.area=(22.0f/7)*radius*radius;
     System.out.println("Updated Area of circle ="+area);
     System.out.println(" **********Accessing Non-Static members**************");
     AllinOneVariable2 r1=new AllinOneVariable2();
     r1.p=10000; r1.r=5; r1.t=2; 
     System.out.println(" Principal amount ="+r1.p);
     System.out.println(" rate of interest="+r1.r);
     System.out.println(" time in years="+r1.t);
     System.out.println(" Simple interest ="+r1.SI);
     r1.SI=(r1.p*r1.r*r1.t)/100;
     System.out.println(" Updated Simple interest ="+r1.SI);
     double amount =r1.p+r1.SI;
     System.out.println("final amount="+amount);
     r1.p= amount;
     r1.SI=(r1.p*r1.r*r1.t)/100;
     //System.out.println(" Updated Principal amount ="+r1.p);
     System.out.println(" Updated2 Simple interest ="+r1.SI);
     
     
	}

}
