package day4_2.methodOverloading;

public class methodOverloading1 {
     static double res;
     public static void square(double num) {
    	res=num*num;
    	System.out.println("Method with double argument called:"+res);
     }
     public static void square() {
     	System.out.println("No parameter Method called");
      }
     public static void square(int num) {
     	res=num*num;
     	System.out.println("Method with int argument called:"+res);
      }
	public static void main(String[] args) {
		methodOverloading1.square(15);
		methodOverloading1.square(8.5);
		methodOverloading1.square('A');
		methodOverloading1.square();
		square(9f);

	}

}
