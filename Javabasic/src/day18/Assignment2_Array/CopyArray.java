package day18.Assignment2_Array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int arr1[]= {15, 35, 65, -45, 50, -70};
		int arr2[]=arr1;
		
		System.out.print("Original array is : ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] +" ");
		}
        System.out.println();
        
        System.out.print("Copied array is : ");
		for(int num:arr2) {
			System.out.print(num +" ");
		}
		 System.out.println();
		 //or
		 int[] CopyTo=Arrays.copyOf(arr1, arr1.length);
		 System.out.print("Copied array 2 is : ");
			for(int num:CopyTo) {
				System.out.print(num +" ");
			}
	}

}
