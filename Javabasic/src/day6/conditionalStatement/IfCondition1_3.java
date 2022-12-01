package day6.conditionalStatement;

public class IfCondition1_3 {
	public static void main(String[] args) {
		int num=50;
		 if (num % 2==0) {
	    	   System.out.println("even number");
	           }
	       else {
	    	   System.out.println("odd number ");
	       }

	 System.out.println("***************************************** ");
	 EvenOddNumber(250);
	 EvenOddNumber(181);
	 System.out.println("***************************************** ");
	 System.out.println("given number is odd : " +EvenOrOdd(99));
	 System.out.println("***************************************** ");
	 System.out.println("given number is odd : " +EvenOrOdd(164));
	}	
	static void EvenOddNumber(int num) {
		if (num %2==0) {
			 System.out.println( num+ " is even number " );
        }
    else {
 	   System.out.println( num+ " is odd number " );
		}
	}
	
	static boolean EvenOrOdd(int num) {
		if (num %2 !=0) {
			 System.out.println("Given number is  :" +num);
			return true;
       }
           else {
	           System.out.println("Given number is :" +num);
        	   return false;
		}
	}
	
}