package day11.Practice;
class company{
	static int age;
    double EmpId;
    void display() {
    	System.out.println("i am display of class company");
    	System.out.println("age :"+age +" EmpId :"+EmpId);
    }
    void display(int a, double b ) {
    	System.out.println("i am display of class company with int, double parameter");
    	age=a; 
    	EmpId=b;
    	System.out.println("age :"+age +" EmpId :"+EmpId);
    }
    void display(double EmpId, int age ) {
    	System.out.println("i am display of class company with double, int parameter");
    	System.out.println("local variable age :"+age);
    	System.out.println("local variable EmpId:"+EmpId);
    	company.age=age; 
    	this.EmpId=EmpId;
    	System.out.println("Global variable age :"+company.age);
    	System.out.println("Global variable EmpId:"+this.EmpId);
    	}
    company() {
    	this(85000.0f);
    	System.out.println("zero parameterized constructor of company");
    	 }
    company(float salary) {
    	System.out.println("single parameterized constructor of company");
    	System.out.println("Salary given by company :"+salary);
    	 }
}
class Employee extends company{
	static int age;
	double EmpId;
	void Print() {
		System.out.println("I am print of Employee class");
		System.out.println("age :"+age +" EmpId :"+EmpId);
	}
	void Print(int age , double EmpId) {
		System.out.println("I am print of Employee class with int, double parameter");
		System.out.println("Local age :"+age +" Local EmpId :"+EmpId);
		System.out.println("Global age :"+Employee.age +"  Global EmpId :"+this.EmpId);
		System.out.println("Company age :"+company.age +"   EmpId :"+super.EmpId);
		super.display();
	}
	 Employee(){
		this(75000);
		 System.out.println("zero parameterized constructor of Employee"); 
	 }
	 Employee(int salary){
		 super(90000.5f);
		 System.out.println("Single parameterized constructor of Employee"); 
		 System.out.println("Employee Salary  :"+salary);
	 }
}
public class Practice3 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println("---------------------------------------------------------");
		Employee e2=new Employee(80000);
		System.out.println("---------------------------------------------------------");
        e1.display();
        e1.display(26, 101.1);
        e1.display(210.1, 30);
        e1.Print();
        e1.Print(35,110);
	}

}
