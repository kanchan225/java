package day18.Assignment2_Array;

public class EvenOrOddElement {

	public static void main(String[] args) {
		int []a= {10,12,25,0,33,49,64};
		for(int num:a) {
			if(num%2==0) {
				System.out.println(num +" is even number");
			}else {
				System.out.println(num +" is odd number");
			}
		}

	}

}
