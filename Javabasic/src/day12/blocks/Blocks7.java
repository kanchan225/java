package day12.blocks;

public class Blocks7 {
	final static int age;
	final double salary;
	static {
		age=30;
	}
	{
		salary=45000.32;
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		System.out.println("age : "+Blocks7.age);
		System.out.println("***********************************");
		Blocks7 b1=new Blocks7();
		System.out.println("salary : "+b1.salary);
		System.out.println("main() ends");

	}

}
