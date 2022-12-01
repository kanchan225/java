package day4.operators;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean bool1=true, bool2=false;
    System.out.println("bool1 && bool2 =" + (bool1 && bool2));//f
    
    System.out.println("bool1 || bool2 =" + (bool1 || bool2));//t
    
    System.out.println("!(bool1 && bool2)=" + !(bool1 && bool2));//t
    
    System.out.println("!(bool1 || bool2) =" + !(bool1 || bool2));//
	}

}
