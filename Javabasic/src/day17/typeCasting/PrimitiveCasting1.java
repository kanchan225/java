package day17.typeCasting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		int myInt=9;
		double myDouble= myInt;//widening implicit
		double d= (double)myInt;//widening explicit
         System.out.println(myInt);
         System.out.println(myDouble);
         System.out.println(d);
         System.out.println("*********************************");
         
         double salary=75000.65478923567d;
         int salary1=(int)salary;//narrowing explicit
         //int salary2=salary;//implicit narrowing not possible
         long L=(long)salary;//narrowing
         float F=(float)salary;//narrowing
         System.out.println("Actual Salary : "+salary);
         System.out.println("int Salary : "+salary1);
         System.out.println("long Salary : "+L);
         System.out.println("float Salary : "+F);
        	 
	}

}
