package day10.thiskeyword;

public class ThisKeyword {
	static int age=25;
	int empId=101;
	
	void display() {
		int empId=505;
		System.out.println("empId:" +empId);
		System.out.println(" NSGV empId:" +this.empId);
	}

	public static void main(String[] args) {
		int age=10;
		System.out.println("age :"+age);
		System.out.println("SGV age :"+ThisKeyword.age);

		ThisKeyword s1= new ThisKeyword();
		s1.display();
		System.out.println(s1.empId);
	}

}
