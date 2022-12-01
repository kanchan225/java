package day11.Practice;

public class Practice1 {
	static int age;
	int salary;
	static void display() {
		System.out.println("age : "+age );
		}
	Practice1(){
		System.out.println("Zero parameterized constructor called" );
		age=26;
		salary=75000;
		}
	Practice1(int a, int b){
		System.out.println("int , int parameterized constructor called" );
		age=a;
		salary=b;
		}
	Practice1(int age){
		System.out.println("int parameterized constructor called" );
		this.age=age;
		}
	void print() {
		System.out.println("print age :"+age);
		System.out.println("print salary :"+salary);
	}
	void print(int age, int salary) {
		System.out.println("print local age :"+age);
		System.out.println("print local salary :"+salary);
		System.out.println("print Global age :"+this.age);
		System.out.println("print Global salary :"+this.salary);
		this.age=age;
		this.salary=salary;
		System.out.println("updated print Global age :"+this.age);
		System.out.println("updated print Global salary :"+this.salary);
		
	}

	public static void main(String[] args) {
		final int variable=101;
         System.out.println("Local variable variable1:"+variable);
         display();
         Practice1 p1=new Practice1();
         display();
         p1.print();
         p1.print(30,90000);
         System.out.println("--------------------------------------------------");
         Practice1 p2=new Practice1(35);
         display();
         p2.print();
         p2.print(30,90000);
         System.out.println("--------------------------------------------------");
         Practice1 p3=new Practice1(40, 500000);
         display();
         p3.print();
         p3.print(30,90000);
	}

}
