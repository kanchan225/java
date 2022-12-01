package day4.operators;

public class LogicalOp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1=5, num2=10;
       boolean res1, res2;
       res1=(num1!=num2);
       res2=(num1<num2);
       System.out.println("Result1 :" +res1);//t
       System.out.println("Result2 :" +res2);//t
       
       System.out.println("bool1 && bool2 =" + (res1 && res2));//t
       System.out.println("bool1 || bool2 =" + (res1 || res2));//t
       System.out.println("!(bool1 && bool2) =" + !(res1 && res2));//f
	}

}
