package day3.globalvariables;

public class AllinOneVariables {
    static int empId=10;
    double salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age=26;
    System.out.println("Age is :"+age);
    System.out.println(" **********Accessing static members**********");
    System.out.println("Initial static GV empId: "+AllinOneVariables.empId);
    AllinOneVariables.empId=101;
    System.out.println("Updated static GV empId :"+empId);
    System.out.println(" **********Accessing non-static members************");
    AllinOneVariables r1= new AllinOneVariables();
    System.out.println("Initial non-static GV salary = "+r1.salary);
    r1.salary=75000;
    System.out.println("Updated non-static GV salary = "+r1.salary);
    System.out.println("**********New Instance created*********** ");
    AllinOneVariables r2= new AllinOneVariables();
    r2.salary=100000;
    System.out.println("Updated2 non-static GV salary = "+r2.salary);
    System.out.println("********************************************************* ");
    empId=1001;
    System.out.println("Updated2 static GV empId : "+AllinOneVariables.empId);
    System.out.println("********************************************************* ");
    age=30;
    System.out.println(" Updated Age is :"+age);
	}

}
