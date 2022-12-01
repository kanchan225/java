package day10.constructor;

public class Cons3 {
     int age;
     double salary;
     Cons3() {
    	 System.out.println("Zero parameterised constructor starts");
    	 age=26;
    	 salary=75000.5;
    	 
     }
	public static void main(String[] args) {
		
		Cons3 c1= new Cons3();
		System.out.println(c1.age);
		System.out.println(c1.salary);
		
	}

}
