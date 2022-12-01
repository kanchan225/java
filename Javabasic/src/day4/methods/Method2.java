package day4.methods;

public class Method2 {
	static int salary;
	int empId;
	
	void display() {
		System.out.println("I am Display()");
	}
	
	static void print() {
		System.out.println("I am Print()");
	}

	public static void main(String[] args) {
		System.out.println("static variable salary:"+Method2.salary);
		
		Method2 m1=new Method2();
		System.out.println("non-static variable empId:"+m1.empId);
		m1.empId=101;
		System.out.println("Updated non-static variable empId:"+m1.empId);
		m1.display();
		
		Method2.salary=70000;
		System.out.println("Updated static variable salary:"+salary);
		
		print();
		
		Method2 m2=new Method2();
		System.out.println("Updated2 non-static variable empId:"+m2.empId);
		m2.display();

	}

}
