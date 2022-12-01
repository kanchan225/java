package day12.blocks;
class traning2{   
    static {
	System.out.println("I am SIB 0f traning2 class");
}
    static void  test(){
	System.out.println("test() of traning2 class");
   }
}
public class Blocks10_2 extends traning2 {
	static {
		System.out.println("I am SIB 0f Blocks10 class");
	}
	public static void main(String[] args) {
		System.out.println("main() of Blocks10 class");

	}

}
