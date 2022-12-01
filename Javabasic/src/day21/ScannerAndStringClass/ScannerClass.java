package day21.ScannerAndStringClass;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
//		int age=10;
//		double salary=75000.0;
//		String name="Pune";
		//Object creation of scanner class
		Scanner scn=new Scanner(System.in);
        int age;
        //double salary;
        String name;
        boolean valid;
        //initialization of variable using Scanner class
        System.out.println("Enter age value from console");
        age=scn.nextInt();
        System.out.println("Enter salary value from console");
        double salary=scn.nextDouble();
        System.out.println("Enter name value from console");
        name=scn.next();
        System.out.println("Enter true/false value from console");
        valid=scn.nextBoolean();
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);
        System.out.println("name: "+name);
        System.out.println("valid: "+valid);
        int num1,num2;
        System.out.println("Enter num1: ");
        num1=scn.nextInt();
        System.out.println("Enter num2: ");
        num2=scn.nextInt();
        char op;
        System.out.println("Enter operator: ");
        op=scn.next().charAt(0);
        System.out.println("Addition of two numbers: "+num1+op+num2);
        System.out.println("Addition of two numbers: "+(addNumber(op,num1,num2)));
	}
    static int addNumber(char op, int num1, int num2) {
    	if(op=='+') {
    		return num1+num2;
    	}else {
    		return 0;
    	}
    }
}
