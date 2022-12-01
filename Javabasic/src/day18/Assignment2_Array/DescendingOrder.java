package day18.Assignment2_Array;

public class DescendingOrder {

	public static void main(String[] args) {
		int A[]= {10,12,15,8,5,14,3};
		int temp=0;
		 System.out.println("Descending order of elements of array A");
        for(int i=0;i<A.length; i++) {
        	for(int j=i+1; j<A.length;j++) {
        		if(A[i]<A[j]) {//10<12|12<15
        			temp=A[i];//10|12
        			A[i]=A[j];//12
        			A[j]=temp;//10
        		}
        	}
        	System.out.println(A[i]);
        }


	}

}
