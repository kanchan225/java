package day4_2.methodOverloading;

public class Overloading5 {
	void display() {
		System.out.println("display without para");
	}
	void display(int a, double b) {
		System.out.println("display with int, double");
	}
	void display(double a, double b) {
		System.out.println("display with double, double");
	}
	void display(double a, int b) {
		System.out.println("display with double, int");
	}

	public static void main(String[] args) {
		Overloading5 obj=new Overloading5();
		obj.display();
		obj.display(10, 12.5);
		obj.display(12.5, 25);
		obj.display(32.4, 35.6);
		//obj.display(20, 30);// compile time error as method with int, int para is not there 
	                          // and values passed can be stored in above three methods ,so jvm gets confused which method should be called
	                           
	}

}
