package day4_2.methodOverloading;
 class adder{
	 static int add(int a, int b) {
		 return a+b;
	 }
	 static float add(int a, int b, int c) {
		 return a+b+c;
	 }
	 static void add(int a, double b) {
	 }	 
 }
public class OverLoading3 {

	public static void main(String[] args) {
		System.out.println("Addition of two number= "+adder.add(10, 25));
		System.out.println("Addition of three number= "+adder.add(10, 25, 20));
		System.out.println("***********************************************************");

		methodOverloading1.square(15);
		methodOverloading1.square(8.5);
		methodOverloading1.square();
		System.out.println("***********************************************************");
		Overloading2 obj=new Overloading2();
        obj.square();
        obj.square(25);
        obj.square(12.5f);
	}

}
