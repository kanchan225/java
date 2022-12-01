package day4_2.methodOverloading;

public class OverLoading6 {

	 public static void main(String[] args) {
		System.out.println("I am main(String[] args)"); 
        main(15);
        main(22.8f);
	}
    public static void main(int a) {
    	System.out.println("I am main(int)"); 
    	main(32.3f);
    }
    public static void main(float a) {
    	System.out.println("I am main(float)"); 
    }
     
}
