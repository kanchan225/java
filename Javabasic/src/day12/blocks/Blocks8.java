package day12.blocks;

public class Blocks8 {
	static int age;
	double salary;
	void print() {
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks8 b1=new Blocks8();
		b1.print();
		System.out.println("main() ends");

	}
	{
		//age=25;
		//salary=45000.32;
		print();
		age=30;
		salary=75000.32;
	}

}
