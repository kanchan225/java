package day18.Assignment2_Array;

public class LargestElement {

	public static void main(String[] args) {
		int num[]= {25,40,1,29,55,60};
		int max=num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("Largest element is : "+max);
	}

}
