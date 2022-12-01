package day18.Assignment2_Array;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int A[]= {10,15,10,12,13,12,14,10,14,18};
		int l=A.length;
		System.out.println("Given array is :");
		for(int i=0;i<l;i++) {
			System.out.print(A[i]+" ");
		}
		for(int i=0;i<l-1;i++) {
			for(int j=i+1;j<l;j++) {
				if(A[i]==A[j]) {
					A[j]=A[l-1];
					l--;
				}
			}
		}
		System.out.println();
		System.out.println("New array without repeatation");
		for(int i=0;i<l;i++) {
			System.out.print(A[i]+" ");
		}
	}

}
