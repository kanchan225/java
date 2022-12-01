package day18.Assignment2_Array;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,5};
		System.out.print("Given array is : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element of an array is: "+arr[j]);
				}
			}
		}
		
	}

}
