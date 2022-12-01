package day10.constructor;

public class Cons4 {
	int roll;
	double salary;
	Cons4() {
		
	}
	Cons4(int r, double s){
		roll= r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String[] args) {
		Cons4 c1=new Cons4(101, 75000);
		c1.display();
		Cons4 c2=new Cons4(111, 90000.25);
        c2.display();
        Cons4 c3=new Cons4();
        c3.display();
	}

}
