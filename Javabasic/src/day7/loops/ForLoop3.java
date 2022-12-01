package day7.loops;

public class ForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1; i<=10; i++) {
    	  System.out.println("hello :" +i);
      }
        System.out.println("*****************Print odd number between 1 to 100*********************");
        for(int i=1; i<100; i++) {
//        	if (!(i%2==0)) {
//        		System.out.println("Odd number is :" +i);
//        	}
        	//or
        	if (i%2!=0) {
        		System.out.println("Odd number is :" +i);
        	}
        	//or
//        	if (i%2==1) {
//        		System.out.println("Odd number is :" +i);
//        	}
        }
        System.out.println("**********print Odd number  from range 1 to 25");
        printOddNumberFromRange(100 , 225);
	}
	   static void printOddNumberFromRange(int start , int end) {
		   int i =start;
		   for (; i<=end; i++) {
			     if (i%2==1) {
			    	 System.out.println("Odd number is :" +i);
			     }
		   }
	   }
	

}
