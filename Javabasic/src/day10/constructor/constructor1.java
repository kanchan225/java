package day10.constructor;

public class constructor1 {
	//long age=26.5;
	static int age1='A';
	static float age='+';
//    public void m1(int a) {
//    	System.out.println("int parameter");
//    	 }
    public void m1(int i) {
    	System.out.println("float parameter: " +i);
	 }
	public static void main(String[] args) {
		constructor1 c1=new constructor1();
		c1.m1('A');
		//c1.m1(77f);
		System.out.println(age1);

	}

}
