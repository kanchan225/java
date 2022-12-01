package day18.Assignment2_Array;

public class ReverseOrder {

	public static void main(String[] args) {
		int A[]= {10,20,30,40,50,60};
		System.out.println("Original Array is :");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("Array in reverse order :");
		for(int j=A.length-1; j>=0;j--) {
			System.out.print(A[j]+" ");
		}

	}

}
