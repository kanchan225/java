package day18.Assignment2_Array;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int A[] ={2,5,7,6,15,12};
		int max1=0,max2=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]>max1) {//2>0|5>2|7>5|6<7|15>7|12<15
				max2=max1; //0  |2  |5      |7
				max1=A[i]; //2  |5  |7      |15
			}
			else if(A[i]>max2 && A[i]!=max1){//6>5&&6!=7|12>7&&12!=15
				max2=A[i];//6 |12
			}
		}
        System.out.println("Second largest element of array A is : "+max2);
	}

}
