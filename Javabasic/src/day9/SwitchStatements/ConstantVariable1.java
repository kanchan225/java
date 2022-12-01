package day9.SwitchStatements;

public class ConstantVariable1 {
     final static int empId=101;
     final int acc=250;
	public static void main(String[] args) {
		final int age =15;
        System.out.println("Age="+age);
       // age=10;
        int age1=26;
        System.out.println("Age1="+age1);
        //final age1=30;
        System.out.println("SGV empId="+empId);
        
        ConstantVariable1 c1=new ConstantVariable1();
        System.out.println("NSGV acc="+c1.acc);
        
	}

}
