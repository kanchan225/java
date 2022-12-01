package day12.blocks;

public class Blocks2 {
    static {
    	System.out.println("***** Running static-block1 of class Blocks2...");
    }
	public static void main(String[] args) {
		System.out.println("main() starts");
		System.out.println("I am main() of Blocks1 class....");
		System.out.println("main() ends");
	}
    static {
    	System.out.println("***** Running static-block2 of class Blocks2...");
    }
}
