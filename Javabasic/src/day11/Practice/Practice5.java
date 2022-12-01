package day11.Practice;
class sample{
	static {
		System.out.println("I am static block of class sample");
	}
	{
		System.out.println("I am Non-static block of class sample");
	}
	sample(){
		System.out.println("I am constructor of class sample");
	}
}
public class Practice5 extends sample{
	static {
		System.out.println("I am static block of class practice5");
	}
	{
		System.out.println("I am Non-static block of class practice5");
	}
	Practice5(){
		System.out.println("I am constructor of class practice5");
	}
	public static void main(String[] args) {
		Practice5 p=new Practice5();
		
		
		
		/*class1 :
		          -static block
		          -non-static block
		          -constructor
		  class2 inherits class 1:
		           -static block
		          -non-static block
		          -constructor
        */
	}

}
