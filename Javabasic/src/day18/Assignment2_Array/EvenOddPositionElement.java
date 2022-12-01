package day18.Assignment2_Array;

public class EvenOddPositionElement {

	public static void main(String[] args) {
		int[] num= {10,15,23,32,6,55,90};
		System.out.println("Element at even position :");
        for(int i=0; i<num.length;i=i+2) {
        	System.out.print(num[i]+" ");
        }
        System.out.println();
        //or
        for(int i=0; i<num.length;i++) {
        	if(i%2==0)
        	System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("Element at Odd position :");
        for(int i=1; i<num.length;i=i+2) {
        	System.out.print(num[i]+" ");
        }
        System.out.println();
        //or
        for(int i=1; i<num.length;i++) {
        	if(i%2!=0)
        	System.out.print(num[i]+" ");
        }
	}

}
