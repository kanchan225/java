package day12.blocks;

public class Blocks9 {
	static int age;
	
	static void print () {
		//Blocks9 b=new Blocks9();
		//System.out.println("Age :"+b.age);
		System.out.println("Age :"+age);
	}
	static {
		print();
		System.out.println("*****Running static-block1 of class Blocks9:");
		age=25;
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		System.out.println("I am main() of Blocks9 class");
		print();
		System.out.println("main() ends");
		
		
	}

}
