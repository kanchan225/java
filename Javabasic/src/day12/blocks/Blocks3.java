package day12.blocks;

public class Blocks3 {
	{
		System.out.println("***** Running non-static-block of class Blocks3...");
	}
	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks3 b1=new Blocks3();
		System.out.println("***************************");
		Blocks3 b2=new Blocks3();
		System.out.println("main() ends");
	}

}
