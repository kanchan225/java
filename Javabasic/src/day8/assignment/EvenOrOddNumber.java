package day8.assignment;

public class EvenOrOddNumber {
	static void EvenOrOdd(int num) {
		System.out.println("Given number is :" +num);
		if (num%2==0) {
           System.out.println(" number is even ");
		}
		else {
			System.out.println(" number is odd ");
	}
	}

	public static void main(String[] args) {
		EvenOrOdd(25);
		EvenOrOdd(226);
		System.out.println("*****************************************");
		System.out.println("Given number is odd :" +CheckEvenOdd(135));
		
	}
     static boolean CheckEvenOdd(int num) {
    	 if (num%2!=0) {
    		 System.out.println("Given number is :"+num);
    		 return true;
    	 } else {
    		 System.out.println("Given number is :"+num);
    		 return false;
    	 }
     }
}
