package day18.Assignment2_Array;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int A[]= {10,12,15,8,5,14,3};
		int temp=0;
		 System.out.println("Ascending order of elements of array A");
        for(int i=0;i<A.length; i++) {
        	for(int j=i+1; j<A.length;j++) {
        		if(A[i]>A[j]) {
        			temp=A[i];
        			A[i]=A[j];
        			A[j]=temp;
        		}
        	}
        	System.out.println(A[i]);
        }
	System.out.println("*****************************");
	//OR
	Arrays.sort(A);
	for(int i:A) {
		System.out.println(i);
	}
	}
}
