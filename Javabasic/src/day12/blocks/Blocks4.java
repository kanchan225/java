package day12.blocks;

public class Blocks4 {
	static {
		System.out.println("***** Running static-block1 of class Blocks5...");
	}
	Blocks4() {
		System.out.println("zero parameter constructor");
	}
	{
		System.out.println("***** Running non-static-block1 of class Blocks4...");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks4 b1=new Blocks4();
		System.out.println("***************************");
		Blocks4 b2=new Blocks4();
		System.out.println("main() ends");

	}
	{
		System.out.println("***** Running non-static-block2 of class Blocks4...");
	}
}
