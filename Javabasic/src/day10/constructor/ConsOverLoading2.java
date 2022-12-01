package day10.constructor;

public class ConsOverLoading2 {
	int age ;
	double salary;
	short age1=26;
	 ConsOverLoading2() {
		 System.out.println("having no parameters");
	 }
     ConsOverLoading2(int a) {
		 System.out.println("having int parameters");
		 age=a;
	 }
     ConsOverLoading2(double b ) {
		 System.out.println("having double parameters");
		 salary =b;
	 }
     ConsOverLoading2(int a, double b) {
		 System.out.println("having int parameters");
		 age=a;
		 salary=b;
	 }

	public static void main(String[] args) {
		 ConsOverLoading2 c1= new  ConsOverLoading2('A');
		 System.out.println("After zero parameter constructor, Age ="+c1.age);
		 System.out.println("After zero parameter constructor, Salary ="+c1.salary);
		 
		 ConsOverLoading2 c2= new  ConsOverLoading2(26);
		 System.out.println("After int parameter constructor, Age ="+c2.age);
		 System.out.println("After int parameter constructor, Salary ="+c2.salary);

		 ConsOverLoading2 c3= new  ConsOverLoading2(75000.5);
		 System.out.println("After double parameter constructor, Age ="+c3.age);
		 System.out.println("After double parameter constructor, Salary ="+c3.salary);
		 
		 ConsOverLoading2 c4= new  ConsOverLoading2(22, 90900);
		 System.out.println("After int-double parameter constructor, Age ="+c4.age);
		 System.out.println("After int-double parameter constructor, Salary ="+c4.salary);
	}

}
