package day18.Assignment2_Array;

public class SmallestElement {

	public static void main(String[] args) {
		int num[]= {25,40,1,29,-55,60};
		int min=num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Smallest element is : "+min);
	}

}
