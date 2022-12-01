package day18.arrays;

import java.util.Arrays;

public class M_Array3 {

	public static void main(String[] args) {
		char[] copyFrom= {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		System.out.println("Elements count in copyFrom array: "+copyFrom.length);
		//declaring a destination array
		//char[] copyTo= Arrays.copyOf(copyFrom, copyFrom.length);
		char[] copyTo=Arrays.copyOf(copyFrom, 5);
		System.out.println("Elements count in copyTo array: "+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i] +" ");
		}
		System.out.println("\n********Copy using range**********");
		//char[] copyWithRange=Arrays.copyOfRange(copyFrom, 3 ,copyFrom.length);
		char[] copyWithRange=Arrays.copyOfRange(copyFrom, 1 ,15);
		System.out.println("Elements count in copyWithRange: "+copyWithRange.length);
		for(int i=0;i<copyWithRange.length;i++) {
			System.out.print(copyWithRange[i] +" ");
	    }
		System.out.println("\n********After sorting**********");
		Arrays.sort(copyWithRange);
		for(char c: copyWithRange) {
			System.out.print(c +" ");
		}
	}
}
