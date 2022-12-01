package day11.Practice;
class Demo{
	static int age;
	double salary;
	static {
		System.out.println("static block of class Demo");
		age=26;
	}
	{
		System.out.println("non-static block of class Demo");
		salary= 90000;
		age=30;
	}
	static void display() {
		System.out.println("static variable age = "+age);
		Demo d1=new Demo();
		System.out.println("Non-static variable salary = "+d1.salary);
	}
	static void display(int age) {
		System.out.println("Local variable age = "+age);
		System.out.println("Static variable age = "+Demo.age);
		Demo.age=age;
		System.out.println("Updated Static variable age = "+Demo.age);
	}
	static void display(int x, double salary) {
		System.out.println("static variable age = "+age);
		age=x;
		System.out.println("updated static variable age = "+age);
		Demo d1=new Demo();
		System.out.println("Non-static variable salary = "+d1.salary);
		d1.salary=salary;
		System.out.println("Updated Non-static variable salary = "+d1.salary);
    }
}
public class Practice2 {

	public static void main(String[] args) {
		Demo.display();
		Demo.display(35);
		Demo.display(40, 98000);
		System.out.println("------------------------------------------------------");
		Demo d1=new Demo();
		System.out.println("Salary = "+d1.salary);
		

	}

}
