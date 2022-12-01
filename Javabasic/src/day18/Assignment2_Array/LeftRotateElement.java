package day18.Assignment2_Array;

public class LeftRotateElement {

	public static void main(String[] args) {
		int age[]= {10, 20, 30,40,50,60,70,80,90};
		System.out.println("Original array is :");
		for(int i=0; i<age.length; i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
		//number of rotation for array element
		int n=1;
		//first logic to Left rotate array elements 
		for(int i=0; i<n; i++) {
			int first =age[0],j;
			for(j=0;j<age.length-1;j++) {
				age[j]=age[j+1];
			}
			age[j]=first;
		}
		System.out.println("Left rotate the elements of an array");
		for(int i=0; i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
		//2nd logic to Left rotate array elements 
		int temp=age[0];
		for(int i=0;i<age.length-1;i++) {
			age[i]=age[i+1];
		}
		System.out.println("Left rotate the elements of an array");
		age[age.length-1]=temp;
		for(int i=0; i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
	}

}
