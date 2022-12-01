package day8.assignment;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		 CheckPositiveOrNegative(-23);
		 CheckPositiveOrNegative(320);
	}
     static void  CheckPositiveOrNegative(int num) {
    	 if (num>0) {
    		 System.out.println("given number : "+num+ " is positive");
    	 }
    	 else {
    		 System.out.println("given number : "+num+ " is negative");
    	 }
     }
}
