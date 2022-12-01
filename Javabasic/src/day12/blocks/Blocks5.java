package day12.blocks;

public class Blocks5 {
	static {
		System.out.println("***** Running static-block1 of class Blocks5...");
	}
	{
		System.out.println("***** Running non-static-block1 of class Blocks5...");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks5 b1=new Blocks5();
		System.out.println("***************************");
		Blocks5 b2=new Blocks5();
		System.out.println("main() ends");

	}

}
