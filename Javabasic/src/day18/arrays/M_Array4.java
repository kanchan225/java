package day18.arrays;

import java.util.Arrays;

public class M_Array4 {

	public static void main(String[] args) {
		int arr[]= {33, 3, 4, 5};
		System.out.println("Printing original array");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		//creating clone:
		int cloneOfarr[]=arr.clone();
		System.out.println("\nPrinting clone of the arr array");
		for(int i : cloneOfarr) {
			System.out.print(i + " ");
		}
		System.out.println("\n are both equal arr & cloneOfarr?");
		System.out.println("arr & cloneOfarr content validation :"+Arrays.equals(arr, cloneOfarr));
		System.out.println("************************************************");
		int newCopiedarr[]=Arrays.copyOf(arr, arr.length);
		for(int i : newCopiedarr) {
			System.out.print(i + " ");
		}
		System.out.println("\n************************************************");
		int newCopiedRangearr[]=Arrays.copyOfRange(arr, 1,2);
		for(int i : newCopiedRangearr) {
			System.out.print(i + " ");
		}
		System.out.println("\n newCopiedarr & newCopiedRangearr content validation :"+Arrays.equals(newCopiedarr, newCopiedRangearr));
		System.out.println("********Sorting original arr array");
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
